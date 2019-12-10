/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

/**
 *
 * @author User
 */
public class TaiLieu implements TinhSoAnPham{
   protected String maTaiLieu;
   protected String tenNxb;
   protected int soBan;
   protected int soAnPham;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu, String tenNxb, int soBan) {
        this.maTaiLieu = maTaiLieu;
        this.tenNxb = tenNxb;
        this.soBan = soBan;
    }
    
    

    public String getMaTaiLieu() {
        return maTaiLieu;
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

    @Override
    public String toString() {
        return "  maTaiLieu =  " + maTaiLieu + ", tenNxb  = " + tenNxb + ", soBan   =   " + soBan ;
    }

    @Override
    public double tinhAnPham() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
   
}
