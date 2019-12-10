/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtanit.ex7;

/**
 *
 * @author minhtanit
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private Double gia;

    public Sach() {
    }

    public Sach(String maSach, String tenSach, Double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.gia = gia;
    }

    public String getMaSach() {
        return maSach;
    }

    public void setMaSach(String maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }
    
    public Object[] toObjects() {
        return new Object[] {maSach, tenSach, gia};
    }
}
