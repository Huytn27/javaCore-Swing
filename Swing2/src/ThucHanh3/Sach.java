/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThucHanh3;

/**
 *
 * @author User
 */
public class Sach {
    private String maSach;
    private String tenSach;
    private String tacGia;
    private String chuyenNganh;
    private int namXB, soLuong;

    public Sach(String maSach, String tenSach, String tacGia, String chuyenNganh, int namXB, int soLuong) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNganh = chuyenNganh;
        this.namXB = namXB;
        this.soLuong = soLuong;
    }
    
    public Object[] toObjects(){
        return new Object[] {maSach, tenSach, tacGia, chuyenNganh, namXB, soLuong};
    }
    
}
