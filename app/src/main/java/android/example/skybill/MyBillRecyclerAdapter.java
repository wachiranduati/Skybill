package android.example.skybill;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MyBillRecyclerAdapter extends RecyclerView.Adapter<MyBillRecyclerAdapter.viewHolder>{

    private ArrayList<MyBills> arrayList;
    private Context context;

    public MyBillRecyclerAdapter(Context context, ArrayList<MyBills> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.my_bills_recycler_view_item, viewGroup, false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.myBillsItemTextview.setText(arrayList.get(i).getmBillCompanyName());
        // would have set the imageview below here using glide
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView myBillsItemImageView;
        TextView myBillsItemTextview;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            myBillsItemImageView = itemView.findViewById(R.id.myBillsImageViewItem);
            myBillsItemTextview = itemView.findViewById(R.id.myBillsTextViewItem);
        }
    }
}
