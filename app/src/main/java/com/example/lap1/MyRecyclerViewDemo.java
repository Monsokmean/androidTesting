package com.example.lap1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MyRecyclerViewDemo extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_recycler_view_demo);


        RecyclerView recyclerView = findViewById(R.id.recyclerview);

        List<Item> items = new ArrayList<Item>();
        //TODO: What is array list

        items.add(new Item("John Wick","John.wick@gmail.com",R.drawable.a));
        items.add(new Item("Cheatha Sotra","sotra@gmail.com",R.drawable.b));
        items.add(new Item("Chea Dalin","dalin@gmail.com",R.drawable.c));
        items.add(new Item("So Cheat","cheat@gmail.com",R.drawable.d));
        items.add(new Item("Seab Sean","sean@gmail.com",R.drawable.e));
        items.add(new Item("Mon Mat","mat@gmail.com",R.drawable.f));
        items.add(new Item("Sok Vatana","vatana@gmail.com",R.drawable.g));
        items.add(new Item("Norn Chanda","Chanda@gmail.com",R.drawable.h));
        items.add(new Item("John Wick","John.wick@gmail.com",R.drawable.a));
        items.add(new Item("Cheatha Sotra","sotra@gmail.com",R.drawable.b));
        items.add(new Item("Chea Dalin","dalin@gmail.com",R.drawable.c));
        items.add(new Item("So Cheat","cheat@gmail.com",R.drawable.d));
        items.add(new Item("Seab Sean","sean@gmail.com",R.drawable.e));
        items.add(new Item("Mon Mat","mat@gmail.com",R.drawable.f));
        items.add(new Item("Sok Vatana","vatana@gmail.com",R.drawable.g));
        items.add(new Item("Norn Chanda","Chanda@gmail.com",R.drawable.h));





        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}