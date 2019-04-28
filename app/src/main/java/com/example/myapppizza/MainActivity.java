package com.example.myapppizza;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
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
        plist.add(new PizzaListItem("피자헛", "09:00 ~ 12:00", "https://www.google.com/search?q=%ED%94%BC%EC%9E%90%ED%97%9B%EB%A1%9C%EA%B3%A0&tbm=isch&source=iu&ictx=1&fir=zN4qxcGGbAdKmM%253A%252CCtx4hXhDX1BUSM%252C_&vet=1&usg=AI4_-kSyruYhQaEIWkID2wF0PBZryOla6g&sa=X&ved=2ahUKEwizwpzvkPLhAhVQBKYKHYHLD-0Q9QEwCXoECAcQFg#imgrc=zN4qxcGGbAdKmM:"));
        plist.add(new PizzaListItem("미스터피자", "08:40 ~ 16:00", "https://www.google.com/search?q=%EB%AF%B8%EC%8A%A4%ED%84%B0%ED%94%BC%EC%9E%90+%EB%A1%9C%EA%B3%A0&tbm=isch&source=iu&ictx=1&fir=Q16n8IUAwG-gwM%253A%252CGaRCnIb_Y1O_lM%252C_&vet=1&usg=AI4_-kS6gGvoER-mLOQxcM-QLW7A-KXYmA&sa=X&ved=2ahUKEwjHquCHkfLhAhUYyYsBHVdlDu0Q9QEwA3oECAcQCg#imgrc=Q16n8IUAwG-gwM:"));
        plist.add(new PizzaListItem("파파존슨", "07:00 ~ 19:22", "https://www.google.com/url?sa=i&source=images&cd=&ved=2ahUKEwjA7qO2kfLhAhXZxYsBHaQlDPMQjRx6BAgBEAU&url=https%3A%2F%2Fpl-pl.facebook.com%2Fpages%2Fcategory%2FPizza-Place%2Fpapasejong%2Fposts%2F&psig=AOvVaw2Sg6d5GdJUQ9fHYBcM2iWx&ust=1556518505354439"));
        plist.add(new PizzaListItem("도미노피자", "09:32 ~ 12:23", "http://image.news1.kr/system/photos/2013/3/26/415832/medium.jpg"));
        plist.add(new PizzaListItem("임실피자", "10:25 ~ 18:55", "http://www.jjan.kr/news/photo/201202/428246_112478_2716.jpg"));
    }
}
