/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7a;

/**
 *
 * @author User
 */
public class SinhVien {
    String maSV, hoVaTen;
    int tuoi, diem;

    public SinhVien(String maSV, String hoVaTen, int tuoi, int diem) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }

    public Object[] toObjects(){
//        Object[] a ;
//        a = new Object[] {hoVaTen, diem, tuoi, maSV};;
//        return a ;
        return new Object[] {hoVaTen, maSV, tuoi, diem}; 
    }
    
    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public String getHoVaTen() {
        return hoVaTen;
    }

    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public int getDiem() {
        return diem;
    }

    public void setDiem(int diem) {
        this.diem = diem;
    }
    
    
    
}
