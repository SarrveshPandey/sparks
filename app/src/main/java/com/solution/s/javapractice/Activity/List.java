package com.solution.s.javapractice.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.solution.s.javapractice.Adapter.ListAdapter;
import com.solution.s.javapractice.POJO.Pojo_res;
import com.solution.s.javapractice.R;

import java.util.ArrayList;

public class List extends AppCompatActivity {

    ArrayList<Pojo_res> list = new ArrayList();
    ListAdapter listAdapter;
    RecyclerView recycler;

    Pojo_res pojo_res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        recycler = findViewById(R.id.recycler);

        pojo_res = new Pojo_res("sarvesh",R.drawable.ic_launcher_background);
        list.add(pojo_res);

        pojo_res = new Pojo_res("pandey",R.drawable.ic_launcher_background);
        list.add(pojo_res);

        pojo_res = new Pojo_res("dgvvgggv",R.drawable.ic_launcher_background);
        list.add(pojo_res);

        pojo_res = new Pojo_res("fdsghfhf",R.drawable.ic_launcher_background);
        list.add(pojo_res);

        pojo_res = new Pojo_res("sfuysdvjdsg",R.drawable.ic_launcher_background);
        list.add(pojo_res);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);
        recycler.setLayoutManager(layoutManager);

        listAdapter = new ListAdapter(this,list);
        recycler.setAdapter(listAdapter);
    }
}