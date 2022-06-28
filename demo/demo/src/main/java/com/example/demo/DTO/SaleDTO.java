package com.example.demo.DTO;

public class SaleDTO {


    int sale_id;

    float totalAmount;

    int item_id;


    public int getSale_id() {
        return sale_id;
    }
    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }


    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }


    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int Item_id) {
        this.item_id = item_id;
    }
}
