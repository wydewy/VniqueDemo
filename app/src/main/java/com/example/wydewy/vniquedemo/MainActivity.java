package com.example.wydewy.vniquedemo;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.DisplayMetrics;
import android.util.Log;
import android.widget.GridView;

import com.example.wydewy.vniquedemo.adapter.ScheduleAdapter;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    private GridView mGridView;
    private Map<String, List<String>> items = new LinkedHashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// get display metrics
        final DisplayMetrics metrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(metrics);


        List<String> item0 = new ArrayList<>();
        item0.add("李素");
        item0.add("王皓");
        item0.add("张帅");
        item0.add("张帅");
        item0.add("张帅");
        item0.add("张帅");
        item0.add("吕燕");
        List<String> item1 = new ArrayList<>();
        item1.add("李健力");
        item1.add("吴尚垠");
        item1.add("吴尚垠");
        item1.add("吴尚垠");
        item1.add("吴尚垠");
        item1.add("吴尚垠");
        item1.add("屋岩子");
        item1.add("屋岩子");
        item1.add("屋岩子");
        item1.add("张根硕");
        item1.add("张根硕");
        item1.add("张根硕");

        items.put("星期一", item0);
        items.put("星期二", item1);
        items.put("星期三", item1);
        items.put("星期四", item0);
        items.put("星期五", item0);


        Log.d("TAG", "item0:" + items.get("星期一"));
// set adapter
        mGridView = (GridView) findViewById(R.id.gridview);
        mGridView.setAdapter(new ScheduleAdapter(this, metrics, items, items.size(), Math.max(item0.size(), item1.size())));

    }
}
