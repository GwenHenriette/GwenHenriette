package com.A2.model;


import jakarta.persistence.*;
import jakarta.persistence.Table;


@Entity
@Table(name = "Clients217")
public class Clients217 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clientId217")
    private int clientid;

    @Column(name = "clientCity217")
    private String clientcity;

    @Column(name = "clientName217")
    private String clientname;

    @Column(name = "moneyOwed217")
    private double moneyowed;

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public String getClientcity() {
        return clientcity;
    }

    public void setClientcity(String clientcity) {
        this.clientcity = clientcity;
    }

    public String getClientname() {
        return clientname;
    }

    public void setClientname(String clientname) {
        this.clientname = clientname;
    }

    public double getMoneyowed() {
        return moneyowed;
    }

    public void setMoneyowed(double moneyowed) {
        this.moneyowed = moneyowed;
    }

    public Clients217(int clientid, String clientcity, String clientname, double moneyowed) {
        this.clientid = clientid;
        this.clientcity = clientcity;
        this.clientname = clientname;
        this.moneyowed = moneyowed;
    }

    public Clients217(){

    }
}
