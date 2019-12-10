/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5.model;

import java.io.Serializable;

/**
 *
 * @author minhtanit
 */
public class BanDoc implements Serializable {
    private int ma;
    private String ten;
    private String diaChi;
    private int sdt;

    public BanDoc() {
    }

    public BanDoc(int ma, String ten, String diaChi, int sdt) {
        this.ma = ma;
        this.ten = ten;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMa() {
        return ma;
    }

    public void setMa(int ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }
    
    public Object[] toObjects() {
        return new Object[] {ma, ten, diaChi, sdt};
    }
}
