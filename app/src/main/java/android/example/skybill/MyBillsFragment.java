package android.example.skybill;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MyBillsFragment extends Fragment {

    private ArrayList<MyBills> billData = new ArrayList<>();
    RecyclerView myBillRecyclerView;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_my_bills, container, false);
        myBillRecyclerView = view.findViewById(R.id.myBillsRecyclerView);
        billData.add(new MyBills("some company logo", "Nairobi Water", "1208", "9834lkd98DS"));
        billData.add(new MyBills("some company logo", "WARMA", "200", "0sdpo$#SD"));
        billData.add(new MyBills("some company logo", "KPLC", "54903", "lk#$dss"));
        billData.add(new MyBills("some company logo", "China", "348", "ksldkSD"));
        billData.add(new MyBills("some company logo", "Parking", "900", "SDSDs"));
        billData.add(new MyBills("some company logo", "KCB", "3400", "SSDSASEW#"));
        billData.add(new MyBills("some company logo", "Garbage collection", "432323", "SDSFSD"));


        MyBillRecyclerAdapter adapter = new MyBillRecyclerAdapter(getContext(), billData);
        myBillRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), 3));
        myBillRecyclerView.setAdapter(adapter);
        return view;
    }


}
