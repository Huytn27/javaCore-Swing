/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29_11;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class BanDoc implements Serializable{
    private int maB;
    private String hoTen, diaChi;
    private int sdt;

    public BanDoc(int maB, String hoTen, String diaChi, int sdt) {
        this.maB = maB;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.sdt = sdt;
    }

    public int getMaB() {
        return maB;
    }

    public void setMaB(int maB) {
        this.maB = maB;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
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
    
    public Object[] toObjects(){
        return new Object[] {maB,hoTen,diaChi,sdt};
    }
}
