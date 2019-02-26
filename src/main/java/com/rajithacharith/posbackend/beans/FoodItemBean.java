package com.rajithacharith.posbackend.beans;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class FoodItemBean {
    @JsonIgnore
    private String foodId;
    private String foodItemName;
    private Float foodItemPrice;
    private String foodItemDescription;

    public String getFoodId() {
        return foodId;
    }

    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    public String getFoodItemName() {
        return foodItemName;
    }

    public void setFoodItemName(String foodItemName) {
        this.foodItemName = foodItemName;
    }

    public Float getFoodItemPrice() {
        return foodItemPrice;
    }

    public void setFoodItemPrice(Float foodItemPrice) {
        this.foodItemPrice = foodItemPrice;
    }

    public String getFoodItemDescription() {
        return foodItemDescription;
    }

    public void setFoodItemDescription(String foodItemDescription) {
        this.foodItemDescription = foodItemDescription;
    }





}
