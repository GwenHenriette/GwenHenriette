package com.A2.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "Lines217")
public class Lines217 {
    @Column(name = "priceOrdered217")
    private double price;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "lineNo217")
    private int Linesid;

    @Column(name = "qty217")
    private int qty;

    @Column(name = "poNo217")
    private int poNo;

    @Column(name = "partNo217")
    private int partNo;

    public int getLinesid() {
        return Linesid;
    }

    public void setLinesid(int linesid) {
        Linesid = linesid;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public int getPoNo() {
        return poNo;
    }

    public void setPoNo(int poNo) {
        this.poNo = poNo;
    }

    public int getPartNo() {
        return partNo;
    }

    public void setPartNo(int partNo) {
        this.partNo = partNo;
    }

    public Lines217(int linesid, double price, int qty, int poNo, int partNo) {
        Linesid = linesid;
        this.price = price;
        this.qty = qty;
        this.poNo = poNo;
        this.partNo = partNo;
    }

    public Lines217(){

    }
}
