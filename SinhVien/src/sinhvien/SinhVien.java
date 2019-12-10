/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sinhvien;

/**
 *
 * @author User
 */
public class SinhVien {

    private String maSV , ten ;
    private int tuoi;
    public SinhVien(String maSV, String ten , int tuoi){
        this.maSV = maSV;
        this.ten = ten;
        this. tuoi = tuoi 
  
     
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
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
    
}
