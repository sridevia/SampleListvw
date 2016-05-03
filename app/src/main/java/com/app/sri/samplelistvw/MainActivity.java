package com.app.sri.samplelistvw;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.app.sri.samplelistvw.Adapterspack.CustomAdapter;

public class MainActivity extends AppCompatActivity {

    public ListView lv;
    String[] places={"USA","HYD","IND"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv=(ListView)findViewById(R.id.listView);

        CustomAdapter adapter=new CustomAdapter(MainActivity.this,places);
        lv.setAdapter(adapter);
    }
}
