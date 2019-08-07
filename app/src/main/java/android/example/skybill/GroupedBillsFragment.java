package android.example.skybill;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


public class GroupedBillsFragment extends Fragment {

    RecyclerView groupedFragmentRecyclerView;
    private ArrayList<MyBills> arrayListData = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_grouped_bills, container, false);
        groupedFragmentRecyclerView = view.findViewById(R.id.groupedBillsRecyclerView);
        arrayListData.add(new MyBills("some company logo", "Nairobi Water", "1208", "9834lkd98DS"));
        arrayListData.add(new MyBills("some company logo", "WARMA", "200", "0sdpo$#SD"));
        arrayListData.add(new MyBills("some company logo", "KPLC", "54903", "lk#$dss"));
//        arrayListData.add(new MyBills("some company logo", "China", "348", "ksldkSD"));
//        arrayListData.add(new MyBills("some company logo", "Parking", "900", "SDSDs"));
//        arrayListData.add(new MyBills("some company logo", "KCB", "3400", "SSDSASEW#"));
//        arrayListData.add(new MyBills("some company logo", "Garbage collection", "432323", "SDSFSD"));

        MyGroupedBillRecyclerAdapter adapter = new MyGroupedBillRecyclerAdapter(getContext(), arrayListData);
        groupedFragmentRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        groupedFragmentRecyclerView.setAdapter(adapter);
        return view;
    }

}
