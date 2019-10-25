package com.example.borgerkong;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class FakeDatabase {

    public static FoodItem getFoodItemById (int foodID) {
        return foods.get(foodID);
    }
    public static ArrayList<FoodItem> getAllFoods() {
        return new ArrayList<FoodItem>((List) Arrays.asList(foods.values().toArray()));
    }
    private static final HashMap<Integer, FoodItem> foods = new HashMap<>();

    static {
        foods.put(1, new FoodItem(1,"Bopper", "$2", "This burger has cheese and patty.", 0, R.drawable.bopper));
        foods.put(2, new FoodItem(2,"Booper", "$2", "For doggos",0, R.drawable.booper));
        foods.put(3, new FoodItem(3,"Wapper", "$4", "Patties, Cheese and Veggies, what more can you ask for.",0, R.drawable.wapper));
        foods.put(4, new FoodItem(4,"Cheesey", "$3", "LOTS OF CHEESE",0, R.drawable.cheesey));
        foods.put(5, new FoodItem( 5,"Mc Pacca", "$6", "Packed with ingredients", 0, R.drawable.mcpacca));
        foods.put(6, new FoodItem( 6,"Meat Hater", "$3", "LETTUCE CHOMP TOMATO CRUNCH PINEAPPLE YUM",0, R.drawable.meathater));
        foods.put(7, new FoodItem( 7,"Meat Lover", "$4", "MEAT MEAT MEAT NOM NOM NOM",0, R.drawable.meatlover));
        foods.put(8, new FoodItem( 8,"Hangover Cure", "$3", "Fatty goodness, perfect after a night out",0, R.drawable.hangovercure));
        foods.put(9, new FoodItem( 9,"3's a Crowd", "$8", "All for yourself.",0, R.drawable.threeburgers));
        foods.put(10, new FoodItem( 10,"Fries", "$2.99", "Just the ordinary", 0,R.drawable.fries));
        foods.put(11, new FoodItem( 11,"UwU Fries", "$3", "oWo, uWu, nom", 0,R.drawable.uwufries));
        foods.put(12, new FoodItem(12,"Chocc Sundae", "$2", "Cheaper than Maccas", 0,R.drawable.parfait));
        foods.put(13, new FoodItem(13,"Frozen leemoons", "$1", "Lemonade freshness", 0, R.drawable.lemonade));
        foods.put(14, new FoodItem(14,"Double Trouble", "$2", "When you think you're being healthy and get a water with that coke", 0, R.drawable.coke));
        foods.put(15, new FoodItem( 15,"Frozen KoKe", "$1", "Aldi coke", 0, R.drawable.cola));

    }
}
