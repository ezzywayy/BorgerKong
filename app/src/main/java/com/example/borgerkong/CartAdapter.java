package com.example.borgerkong;

import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class CartAdapter extends RecyclerView.Adapter<CartAdapter.CartViewHolder>{
    public ArrayList<FoodItem> FoodOrder;

    public void setData(ArrayList<FoodItem> data) { this.FoodOrder = data; }

    public class CartViewHolder extends RecyclerView.ViewHolder {
        public TextView foodName;
        public TextView foodQuantity;
        public ImageView foodPicture;

        public CartViewHolder(@NonNull View itemView) {
            super(itemView);
            foodName = itemView.findViewById(R.id.foodname);
            foodQuantity = itemView.findViewById(R.id.amountordered);
            foodPicture = itemView.findViewById(R.id.imageView3);
        }
    }
    @NonNull
    @Override
    public CartViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view =
                LayoutInflater.from(parent.getContext())
                .inflate(R.layout.view_order, parent, false);
        CartViewHolder cartViewHolder = new CartViewHolder(view);
        return cartViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull CartViewHolder holder, int position) {
        final FoodItem foodItem = FoodOrder.get(position);
        holder.foodName.setText(foodItem.getFoodName());
        String foodAmountOrdered = "x" + Integer.toString(foodItem.getAmountOrdered());
        holder.foodQuantity.setText(foodAmountOrdered);
        holder.foodPicture.setImageResource(foodItem.getImageDrawableID());

    }

    @Override
    public int getItemCount() {
        return FoodOrder.size();
    }
}
