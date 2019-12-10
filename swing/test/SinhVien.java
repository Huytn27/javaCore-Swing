/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
        return new Object[] {maSV, hoVaTen, tuoi, diem};
    }
}
