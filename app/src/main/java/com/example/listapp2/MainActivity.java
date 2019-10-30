package com.example.listapp2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> names = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        for(int x=0; x<20; x++){
            names.add(x, "Bob"+x);
        }


        RecyclerView recV = findViewById(R.id.My_recycler_view_view);
        Adapter MyAdapt = new Adapter(this, names);
        recV.setAdapter(MyAdapt);
        recV.setLayoutManager(new LinearLayoutManager(this));

    }
}
