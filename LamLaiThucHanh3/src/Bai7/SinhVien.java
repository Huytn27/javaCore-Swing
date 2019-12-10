/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai7;

/**
 *
 * @author User
 */
public class SinhVien {
    String MaSV, HoTen;
    int tuoi;
    double diem;

    public SinhVien(String MaSV, String HoTen, int tuoi, double diem) {
        this.MaSV = MaSV;
        this.HoTen = HoTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }
    
    public Object[] toObjects(){
        return new Object[] {MaSV, HoTen, tuoi, diem};
    }
}
