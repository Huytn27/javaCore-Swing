/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7_KieuCo;

/**
 *
 * @author User
 */
public class SinhVien {
   private int ma;
     private String ten;
     private int tuoi;
     private double diem;

    public SinhVien() {
    }

    public SinhVien(int ma, String ten, int tuoi, double diem) {
        this.ma = ma;
        this.ten = ten;
        this.tuoi = tuoi;
        this.diem = diem;
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

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public double getDiem() {
        return diem;
    }

    public void setDiem(double diem) {
        this.diem = diem;
    }
     public Object[] toObject(){
         return new Object[]{
            ma,ten,tuoi,diem
         };
     }
}
