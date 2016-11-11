# VniqueDemo

##usage of ScheduleAdapter:
###1.XML:
 <GridView
        android:id="@+id/gridview"
        android:layout_width="fill_parent"
        android:layout_height="match_parent"
        android:background="#DADADA"
        android:gravity="center"
        android:horizontalSpacing="1dp"
        android:numColumns="5"
        android:verticalSpacing="1dp" />
        
###2.JAVA:
 //获得显示区域尺寸
 
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
        List<String> item3 = new ArrayList<>();
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
        List<String> item4 = new ArrayList<>();
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
        List<String> item5 = new ArrayList<>();
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
        items.put("星期三", item3);
        items.put("星期四", item4);
        items.put("星期五", item5);


        Log.d("TAG", "item0:" + items.get("星期一"));

        mGridView = (GridView) findViewById(R.id.gridview);
        mGridView.setAdapter(new ScheduleAdapter(this, metrics, items, items.size(), Math.max(item0.size(), item1.size())));
