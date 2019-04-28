package com.example.myapppizza;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.bumptech.glide.Glide;
import com.example.myapppizza.Adapter.PizzaListAdapter;
import com.example.myapppizza.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends BaseActivity {

    ActivityMainBinding act;

    List<PizzaListItem> plist = new ArrayList<PizzaListItem>();

    PizzaListAdapter mAppadapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setupEvents();
        setValues();
        bindViews();

        act = DataBindingUtil.setContentView(this,R.layout.activity_main);
        mAppadapter = new PizzaListAdapter(MainActivity.this, plist);

        act.orderListView.setAdapter(mAppadapter);

        GetpizzaList();

    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }

    @Override
    public void bindViews() {

    }

    void GetpizzaList() {
        plist.add(new PizzaListItem("파파존스", "09:00~21:00", "http://postfiles2.naver.net/20160530_65/ppanppane_1464617766007O9b5u_PNG/%C6%C4%C6%C4%C1%B8%BD%BA_%C7%C7%C0%DA_%B7%CE%B0%ED_%284%29.png"));
        plist.add(new PizzaListItem("피자헛", "09:00~21:00", "https://upload.wikimedia.org/wikipedia/en/thumb/d/d2/Pizza_Hut_logo.svg/220px-Pizza_Hut_logo.svg.png"));
        plist.add(new PizzaListItem("도미노피자", "09:00~21:00", "https://upload.wikimedia.org/wikipedia/commons/thumb/3/3e/Domino%27s_pizza_logo.svg/120px-Domino%27s_pizza_logo.svg.png"));
        plist.add(new PizzaListItem("미스터피자", "09:00~21:00", "http://postfiles12.naver.net/20160530_171/ppanppane_14646177044221JRNd_PNG/%B9%CC%BD%BA%C5%CD%C7%C7%C0%DA_%B7%CE%B0%ED_%281%29.png"));
        plist.add(new PizzaListItem("피자에땅", "09:00~21:00", "https://mblogthumb-phinf.pstatic.net/20160530_214/ppanppane_1464617804922knKn4_PNG/%C7%C7%C0%DA%BF%A1%B6%A5_%B7%CE%B0%ED_%282%29.png"));
        plist.add(new PizzaListItem("피자스쿨", "09:00~21:00", "https://modo-phinf.pstatic.net/20150501_269/1430484184544WKwLF_JPEG/mosa7NPaR2.jpeg"));
        plist.add(new PizzaListItem("피자나라 치킨공주", "09:00~21:00", "http://www.newsworker.co.kr/news/photo/201810/22592_19806_5940.jpg"));
    }
}
