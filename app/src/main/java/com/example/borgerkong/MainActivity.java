package com.example.borgerkong;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ArrayList<FoodItem> foods = new ArrayList<>();
        foods.add(new FoodItem("Bopper", "$2", "This burger has cheese and patty."));
        foods.add(new FoodItem("Booper", "$2", "For doggos"));
        foods.add(new FoodItem("Wapper", "$4", "Patties, Cheese and Veggies, what more can you ask for."));
        foods.add(new FoodItem("Cheesey", "$3", "LOTS OF CHEESE"));
        foods.add(new FoodItem( "Mc Pacca", "$6", "Packed with ingredients"));
        foods.add(new FoodItem( "Meat Hater", "$3", "LETTUCE CHOMP TOMATO CRUNCH PINEAPPLE YUM"));
        foods.add(new FoodItem( "Meat Lover", "$4", "MEAT MEAT MEAT NOM NOM NOM"));
        foods.add(new FoodItem( "Hangover Cure", "$3", "Fatty goodness, perfect after a night out"));
        foods.add(new FoodItem( "5 Star", "$8", "FANCY STUFF, TRUFFLES, CAVIAR WOAH"));
        foods.add(new FoodItem( "Fries", "$2.99", "Just the ordinary"));
        foods.add(new FoodItem( "Coded Fries", "$3", "Loaded with good bits"));
        foods.add(new FoodItem("Chocc Sundae", "$2", "Cheaper than Maccas"));
        foods.add(new FoodItem("Frozen leemoons", "$1", "Lemonade freshness"));
        foods.add(new FoodItem("Frozen Spirit", "$1", "Sprite but gives you spirit"));
        foods.add(new FoodItem( "Frozen KoKe", "$1", "Aldi coke"));

        recyclerView = findViewById(R.id.rv_main);

        FoodAdapter adapter = new FoodAdapter();
        adapter.setData(foods);
        recyclerView.setAdapter(adapter);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
    }
}
