package com.example.myapppizza.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.myapppizza.PizzaListItem;
import com.example.myapppizza.R;

import java.util.List;

public class PizzaListAdapter extends ArrayAdapter<PizzaListItem> {

    Context mContext;
    List<PizzaListItem> mList;
    LayoutInflater inf;

    public PizzaListAdapter (Context context, List<PizzaListItem> list) {
        super(context, R.layout.activity_piza_list, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        View row = ConvertView;

        if (row == null) {
            row = inf.inflate(R.layout.activity_piza_list, null);
        }

        PizzaListItem appData = mList.get(position);

        TextView storeNameText = row.findViewById(R.id.storeNameText);

        storeNameText.setText(appData.storeName);

        return  row;
    }
}
