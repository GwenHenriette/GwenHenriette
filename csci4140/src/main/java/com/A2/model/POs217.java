package com.A2.model;

import jakarta.persistence.*;
import jakarta.persistence.Table;

@Entity
@Table(name = "POs217")
public class POs217 {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "po_No217")
    private int poNo;

    @Column(name = "date_Of_PO217")
    private String date;

    @Column(name = "status217")
    private String status;

    @Column(name = "client_Comp_ID217")
    private int clientid;

    public int getPoNo() {
        return poNo;
    }

    public void setPoNo(int poNo) {
        this.poNo = poNo;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getClientid() {
        return clientid;
    }

    public void setClientid(int clientid) {
        this.clientid = clientid;
    }

    public POs217(int poNo, String date, String status, int clientid) {
        this.poNo = poNo;
        this.date = date;
        this.status = status;
        this.clientid = clientid;
    }

    public POs217(){

    }
}
