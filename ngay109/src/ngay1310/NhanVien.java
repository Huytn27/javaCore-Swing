/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1310;

/**
 *
 * @author User
 */
public class NhanVien {
    private String ten;
    private String diaChi;
    private int tuoi;

    public NhanVien() {
    }

    public NhanVien(String ten, String diaChi, int tuoi) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
    }
    
    

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    
    
    
}
