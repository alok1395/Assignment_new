package com.example.demo.DTO;

import java.time.LocalDateTime;

public class ItemDTO {

    int item_id;

    String item_name;
    float amount;

    int sale_id;

    public int getItem_id() {
        return item_id;
    }
    public void setItem_id(int Item_id) {
        this.item_id = item_id;
    }


    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name) {
        this.item_name = item_name;
    }


    public float getAmount() {
        return amount;
    }
    public void setAmount(float amount) {
        this.amount = amount;
    }




    public int getSale_id() {
        return sale_id;
    }
    public void setSale_id(int sale_id) {
        this.sale_id = sale_id;
    }
}
