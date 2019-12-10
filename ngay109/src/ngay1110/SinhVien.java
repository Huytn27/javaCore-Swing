/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1110;

/**
 *
 * @author User
 */
public class SinhVien {
   private String ma, ten, diachi;
   private int tuoi;
   private double dlthdt;
   private boolean uutien;

    public SinhVien(String ma, String ten, String diachi, int tuoi, double dlthdt, boolean uutien) {
        this.ma = ma;
        this.ten = ten;
        this.diachi = diachi;
        this.tuoi = tuoi;
        this.dlthdt = dlthdt;
        this.uutien = uutien;
    }

    public String getMa() {
        return ma;
    }

    public String getTen() {
        return ten;
    }

    public String getDiachi() {
        return diachi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public double getDlthdt() {
        return dlthdt;
    }

    public boolean isUutien() {
        return uutien;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public void setDlthdt(double dlthdt) {
        this.dlthdt = dlthdt;
    }

    public void setUutien(boolean uutien) {
        this.uutien = uutien;
    }
   
    public String toString(){
        return ma+"\t"+ten+"\t"+tuoi+"\t"+diachi+"\t";
    }
   
}
