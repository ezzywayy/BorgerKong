package com.example.borgerkong;

public class FoodItem {
    //unique identifier
    private int foodID;

    //name of burger
    private String foodName;
    //price
    private String price;
    //content
    private String content;
    //amount ordered
    private int amountOrdered;
    //image
    private int imageDrawableID;

    public FoodItem(int foodID, String foodName, String price, String content, int amountOrdered, int imageDrawableID) {
        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
        this.content = content;
        this.amountOrdered = amountOrdered;
        this.imageDrawableID = imageDrawableID;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public int getAmountOrdered() { return amountOrdered; }

    public void setAmountOrdered(int amountOrdered) { this.amountOrdered = amountOrdered; }

    public int getImageDrawableID() {
        return imageDrawableID;
    }

    public void setImageDrawableID(int imageDrawableID) {
        this.imageDrawableID = imageDrawableID;
    }

    public int getFoodID() {
        return foodID;
    }

    public void setFoodID(int foodID) {
        this.foodID = foodID;
    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
