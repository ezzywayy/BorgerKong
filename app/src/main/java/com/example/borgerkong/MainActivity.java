package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;
    private static ArrayList<FoodItem> foodOrder = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.rv_main);

        final FoodAdapter adapter = new FoodAdapter();
        adapter.setData(FakeDatabase.getAllFoods());
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);

//        Intent intent = getIntent();
//        int foodID = intent.getIntExtra("foodID",0);
//        if (foodID != 0 ){
//            FoodItem foodItem = new FoodItem(foodID);
//            int amountOrdered = intent.getIntExtra("amountOrdered", 0);
//
//        }

        FloatingActionButton shoppingCart = findViewById(R.id.floatingActionButton);
        shoppingCart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context = v.getContext();
                Intent intent = new Intent(getApplicationContext(), ShoppingCartActivity.class);
                intent.putExtra("foodOrder", foodOrder);
                startActivity(intent);
            }
        });
    }
}
