package com.A2.model;
import jakarta.persistence.*;


@Entity
@Table(name = "Parts217")
public class Parts217 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "part_No217")
    private Long partNo217;

    @Column(name = "qoh217")
    private int qty;

    @Column(name = "part_Name")
    private String partName;

    @Column(name = "current_Price217")
    private double price;

    public Long getPartNo() {
        return partNo217;
    }

    public void setPartNo(Long partNo) {
        this.partNo217 = partNo;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public String getPartName() {
        return partName;
    }

    public void setPartName(String partName) {
        this.partName = partName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Parts217(Long partNo217, int qty, String partName, double price) {
        this.partNo217 = partNo217;
        this.qty = qty;
        this.partName = partName;
        this.price = price;
    }

    // No-argument constructor
    public Parts217() {
    }
}
