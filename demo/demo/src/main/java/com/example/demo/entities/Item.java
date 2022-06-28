package com.example.demo.entities;

import javax.persistence.*;

@Entity
public class Item {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int item_id;

    @Column(nullable = false)
    private String item_name ;


    @Column(nullable = false)
    private float amount;

    @OneToMany
    @JoinColumn(name = "sale_id", nullable = false)
    private Sale sale;



    public static Item getItem_id() {
        return item_id;
    }
    public void setItem_id(int item_id){ this.item_id = item_id; }

    public String getItem_name() {
        return item_name;
    }
    public void setItem_name(String item_name ){ this.item_id = item_id; }


    public float getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    public Sale getSale() {
        return sale;
    }
    public void setSale(Sale sale) {
        this.sale = sale;
    }


    @Override
    public String toString() {
        return "Item{" +
                "item_id=" + item_id +
                ", item_name="+item_name+
                ", amount=" + amount +
                ", sale_id=" + sale +
                '}';
    }
}
