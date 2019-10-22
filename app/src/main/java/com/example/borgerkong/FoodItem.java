package com.example.borgerkong;

public class FoodItem {
    //unique identifier
   // private int foodID;

    //name of burger
    private String foodName;
    //price
    private String price;
    //content
    private String content;
    //image
    private int imageDrawableID;

    public FoodItem(String foodName, String price, String content) {
//        this.foodID = foodID;
        this.foodName = foodName;
        this.price = price;
        this.content = content;
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


    public int getImageDrawableID() {
        return imageDrawableID;
    }

    public void setImageDrawableID(int imageDrawableID) {
        this.imageDrawableID = imageDrawableID;
    }

//    public int getFoodID() {
//        return foodID;
//    }
//
//    public void setFoodID(int foodID) {
//        this.foodID = foodID;
//    }

    public String getFoodName() {
        return foodName;
    }

    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }
}
