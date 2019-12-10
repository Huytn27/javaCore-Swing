/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package De2Nhom7;

/**
 *
 * @author User
 */
public class Sach {
    String maSach, tenSach, tenTG, chuyenNganh;
    int namXB, soLg;

    public Sach(String maSach, String tenSach, String tenTG, String chuyenNganh, int namXB, int soLg) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tenTG = tenTG;
        this.chuyenNganh = chuyenNganh;
        this.namXB = namXB;
        this.soLg = soLg;
    }
    
    public Object[] toObjects(){
        return new Object[] {maSach, tenSach, tenTG, chuyenNganh, namXB, soLg};
    }
}
