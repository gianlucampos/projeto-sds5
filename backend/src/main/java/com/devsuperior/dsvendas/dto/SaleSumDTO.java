package com.devsuperior.dsvendas.dto;

import com.devsuperior.dsvendas.entities.Seller;

import java.io.Serializable;

public class SaleSumDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    private String sellerName;
    private Double num;

    public SaleSumDTO() {
    }

    public SaleSumDTO(Seller seller, Double num) {
        this.sellerName = seller.getName();
        this.num = num;
    }

    public String getSellerName() {
        return sellerName;
    }

    public void setSellerName(String sellerName) {
        this.sellerName = sellerName;
    }

    public Double getNum() {
        return num;
    }

    public void setNum(Double num) {
        this.num = num;
    }
}
