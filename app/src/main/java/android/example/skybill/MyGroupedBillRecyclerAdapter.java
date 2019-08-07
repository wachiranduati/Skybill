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

public class MyGroupedBillRecyclerAdapter extends RecyclerView.Adapter<MyGroupedBillRecyclerAdapter.viewHolder>{

    private ArrayList<MyBills> arrayList;
    private Context context;

    public MyGroupedBillRecyclerAdapter(Context context, ArrayList<MyBills> arrayList) {
        this.arrayList = arrayList;
        this.context = context;
    }

    @NonNull
    @Override
    public viewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.grouped_my_bills_recycler_view_item, viewGroup, false);
        viewHolder holder = new viewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull viewHolder viewHolder, int i) {
        viewHolder.groupedBillsCompanyName.setText(arrayList.get(i).getmBillCompanyName());
        viewHolder.groupedBillsCodeTextView.setText(arrayList.get(i).getmCode());
        viewHolder.groupedBillsPriceTextview.setText(arrayList.get(i).getmPrice());
        // would have set the imageview below here using glide
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class viewHolder extends RecyclerView.ViewHolder{
        ImageView groupedBillsImageView;
        TextView groupedBillsCompanyName, groupedBillsCodeTextView, groupedBillsPriceTextview;
        public viewHolder(@NonNull View itemView) {
            super(itemView);
            groupedBillsImageView = itemView.findViewById(R.id.groupedmyBillsImageViewItem);
            groupedBillsCompanyName = itemView.findViewById(R.id.groupedmyBillsCompanyNameTextview);
            groupedBillsCodeTextView = itemView.findViewById(R.id.groupedmyBillscodeTextViewItem);
            groupedBillsPriceTextview = itemView.findViewById(R.id.groupedmyBillsPriceTextviewItem);

        }
    }
}
