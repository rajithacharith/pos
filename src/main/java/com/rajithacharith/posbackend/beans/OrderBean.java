package com.rajithacharith.posbackend.beans;

public class OrderBean {
    private String orderID;
    private String foodItemID;
    private int quantity;
    public String getOrderID() {
        return orderID;
    }

    public void setOrderID(String orderID) {
        this.orderID = orderID;
    }

    public String getFoodItemID() {
        return foodItemID;
    }

    public void setFoodItemID(String foodItemID) {
        this.foodItemID = foodItemID;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }




}
