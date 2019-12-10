/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlitailieu;

/**
 *
 * @author User
 */
public class TaiLieu {
    protected String maTaiLieu;
    protected String tenNxb;
    protected int soBan;
    protected int soAnPham;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu1, String tenNxb1, int soBan1) {
        maTaiLieu = maTaiLieu1;
        tenNxb = tenNxb1;
        soBan = soBan1;
    }

    @Override
    public String toString() {
        return "TaiLieu{" + "maTaiLieu=" + maTaiLieu + ", tenNxb=" + tenNxb + ", soBan=" + soBan + ", soAnPham=" + soAnPham + '}';
    }
    
    public void nhap() {
        
    }
    
    

    public String getMaTaiLieu() {
        return this.maTaiLieu;
    }

    public void setMaTaiLieu(String maTaiLieu) {
        this.maTaiLieu = maTaiLieu;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    public int getSoAnPham() {
        return soAnPham;
    }

    public void setSoAnPham(int soAnPham) {
        this.soAnPham = soAnPham;
    }
    
    
}
