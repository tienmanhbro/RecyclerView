package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<doituong> items = new ArrayList<doituong>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setdata();

        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layout);

        RecyclerView.Adapter adapter = new Adapter(this,items);
        recyclerView.setAdapter(adapter);
    }
    public void setdata(){
        items.add(new doituong("nguyen quynh huong","a@gmail.com",R.drawable.ss0));
        items.add(new doituong("ngo thi ut thuong","b@gmail.com",R.drawable.ss1));
        items.add(new doituong("le thi duyen","c@gmail.com",R.drawable.ss2));
        items.add(new doituong("nguyen huyen thao","d@gmail.com",R.drawable.ss3));
        items.add(new doituong("tran thu nguyet","e@gmail.com",R.drawable.ss4));
        items.add(new doituong("dang thu xuan","f@gmail.com",R.drawable.ss5));
        items.add(new doituong("nguyen dieu minh","g@gmail.com",R.drawable.ss6));
        items.add(new doituong("le huyen my","h@gmail.com",R.drawable.ss7));
        items.add(new doituong("dinh thu yen","i@gmail.com",R.drawable.ss8));
        items.add(new doituong("do hien diu","k@gmail.com",R.drawable.ss9));

    }
}