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
public class Sach implements Serializable{
    private int maSach;
    private String tenSach, tacGia,chuyenNghanh;
    private int namXB, soLg;

    public Sach(int maSach, String tenSach, String tacGia, String chuyenNghanh, int namXB, int soLg) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.chuyenNghanh = chuyenNghanh;
        this.namXB = namXB;
        this.soLg = soLg;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getChuyenNghanh() {
        return chuyenNghanh;
    }

    public void setChuyenNghanh(String chuyenNghanh) {
        this.chuyenNghanh = chuyenNghanh;
    }

    public int getNamXB() {
        return namXB;
    }

    public void setNamXB(int namXB) {
        this.namXB = namXB;
    }

    public int getSoLg() {
        return soLg;
    }

    public void setSoLg(int soLg) {
        this.soLg = soLg;
    }
    
    public Object[] toObjects(){
        return new Object[] {maSach, tenSach, tacGia, chuyenNghanh,namXB,soLg};
    }
}
