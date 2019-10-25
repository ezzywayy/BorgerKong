package com.example.borgerkong;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;


public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.FoodViewHolder> {
    public ArrayList<FoodItem> FoodMenu;
//    private Context context;

    //    public MyAdapter(ArrayList<FoodItem> data, Activity context){
//        this.data =data;
//        this.context = context;
//    }
    public void setData(ArrayList<FoodItem> data) {
        this.FoodMenu = data;
    }

    public class FoodViewHolder extends RecyclerView.ViewHolder {
        public TextView foodName;
        public ImageView foodPicture;

        public FoodViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.textView);
            foodPicture = itemView.findViewById(R.id.imageView);
        }
    }

    @NonNull
    @Override
    public FoodViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.food_home, parent, false);
        FoodViewHolder foodViewHolder = new FoodViewHolder(view);
        return foodViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodViewHolder holder, int position) {
        final FoodItem food = FoodMenu.get(position);
        holder.foodName.setText(food.getFoodName());
        holder.foodPicture.setImageResource(food.getImageDrawableID());
        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Context context = view.getContext();

                Intent intent = new Intent(context, FoodDetailActivity.class);
                intent.putExtra("FoodID", food.getFoodID());
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return FoodMenu.size();
    }
}
