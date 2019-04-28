package com.example.myapppizza.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.myapppizza.PizzaListItem;
import com.example.myapppizza.R;

import java.util.List;

public class PizzaListAdapter extends ArrayAdapter<PizzaListItem> {

    Context mContext;
    List<PizzaListItem> mList;
    LayoutInflater inf;

    public PizzaListAdapter (Context context, List<PizzaListItem> list) {
        super(context, R.layout.activity_pizza_list, list);

        mContext = context;
        mList = list;
        inf = LayoutInflater.from(mContext);
    }

    @Override
    public View getView(int position, View ConvertView, ViewGroup parent) {
        View row = ConvertView;

        if (row == null) {
            row = inf.inflate(R.layout.activity_pizza_list, null);
        }

        PizzaListItem appData = mList.get(position);

        TextView storeNameText = row.findViewById(R.id.storeNameText);

        storeNameText.setText(appData.storeName);

        ImageView storeLogoImage = row.findViewById(R.id.store_logo_image);

        String url = appData.logoImgUrl;

        Glide.with(mContext).load(url).into(storeLogoImage);

        ImageView detailImageView = row.findViewById(R.id.detailImageView);

        detailImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(mContext, "으앎아ㅓ", Toast.LENGTH_LONG).show();
            }
        });

        return  row;
    }
}
