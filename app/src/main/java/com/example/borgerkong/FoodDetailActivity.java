package com.example.borgerkong;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;

public class FoodDetailActivity extends AppCompatActivity {
    private TextView foodName;
    private TextView price;
    private TextView content;
    private TextView counter;
    private ImageView foodPicture;
    private ArrayList<Integer> foodItems;
    //    private TextView amountOrdered;
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.food_detail);

        Intent intent = getIntent();
        final int foodID = intent.getIntExtra("FoodID", 0);

        FoodItem food = FakeDatabase.getFoodItemById(foodID);
        foodName = findViewById(R.id.name);
        price = findViewById(R.id.price);
        content = findViewById(R.id.content);
        foodPicture = findViewById(R.id.imageView2);
//        amountOrdered = findViewById(R.id.amount_ordered);

        foodName.setText(food.getFoodName());
        price.setText(food.getPrice());
        content.setText(food.getContent());
        foodPicture.setImageResource(food.getImageDrawableID());

        counter = findViewById(R.id.integer);

        final Button plusbtn = findViewById(R.id.button);
        final Button minusbtn = findViewById(R.id.button2);
        plusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count++;
                counter.setText(String.valueOf(count));
            }
        });

        minusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                count--;
                if (count < 0){
                    count=0;
                }
                counter.setText(String.valueOf(count));
            }
        });

        final Button orderbtn = findViewById(R.id.button3);
        orderbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
//            foodItems.add(0, foodID);
            Intent intent1 = new Intent(getApplicationContext(), MainActivity.class);
            intent1.putExtra("foodID", foodID);
            intent1.putExtra("counter", count);
            startActivity(intent1);
//                Context context = getApplicationContext();
//                CharSequence text = "Order has been added to cart";
//                int duration = Toast.LENGTH_SHORT;
//
//                Toast toast = Toast.makeText(context,text,duration);
//                toast.show();
            }
        });




    }
//    @Override
//    public void onClick(View v) {
//        switch (v.getId()) {
//            case R.id.button:
//                count++;
//                break;
//
//            case R.id.button2:
//                count--;
//                break;
//        }
//        counter.setText(String.valueOf(count));
//    }

}
