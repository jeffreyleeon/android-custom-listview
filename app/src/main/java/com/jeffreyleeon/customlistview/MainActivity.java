package com.jeffreyleeon.customlistview;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private Context context;

    private ArrayList prgmName;
    public static int [] prgmImages = {
            R.drawable.lang1,
            R.drawable.lang2,
            R.drawable.lang3,
            R.drawable.lang4,
    };
    public static String [] prgmNameList = {
            "C++",
            "Java",
            "Ruby",
            "Python"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        context = this;
        listView = (ListView)findViewById(R.id.listView);
        listView.setAdapter(new CustomAdapter(this, prgmNameList, prgmImages));
    }
}
