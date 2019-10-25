package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class ShoppingCartActivity extends AppCompatActivity {
    private ArrayList<FoodItem> foodOrder;
    private RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.view_order);
        Intent intent = getIntent();

        foodOrder = (ArrayList<FoodItem>) getIntent().getSerializableExtra("foodOrder");

        recyclerView = findViewById(R.id.recyclerView);

        final CartAdapter cAdapter = new CartAdapter();
        cAdapter.setData(foodOrder);
        recyclerView.setAdapter(cAdapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

    }


}
