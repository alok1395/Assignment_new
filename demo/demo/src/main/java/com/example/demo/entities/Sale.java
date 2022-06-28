package com.example.demo.entities;


import javax.persistence.*;

@Entity
public class Sale {
    @Id
    @Column(name = "sale_id", nullable = false)
    private int sale_id;

    @Column(nullable = false)
    private float totalAmount;

    @ManyToOne
    @JoinColumn(name = "item_id", nullable = false)
    private Item item ;

    public int getId() {
        return sale_id;
    }
    public void setId(Long id) {
        this.sale_id = sale_id;
    }


    public float getTotalAmount() {
        return totalAmount;
    }
    public void setTotalAmount(float totalAmount) {
        this.totalAmount = totalAmount;
    }


    public Item getItem() {
        return item;
    }
    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "Sale{" +
                "sale_id=" + sale_id +
                ", totalAmount=" + totalAmount +
                ", item_id=" + item +
                '}';


    }
}
