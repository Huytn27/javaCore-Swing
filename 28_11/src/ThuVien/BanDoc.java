/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuVien;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class BanDoc implements Serializable{
    private int maBanDoc;
    private String hoTen, diaChi;
    private int SDT;

    public BanDoc(int maBanDoc, String hoTen, String diaChi, int SDT) {
        this.maBanDoc = maBanDoc;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
        this.SDT = SDT;
    }

    public int getMaBanDoc() {
        return maBanDoc;
    }

    public void setMaBanDoc(int maBanDoc) {
        this.maBanDoc = maBanDoc;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
    }
    
    public Object[] toObjects(){
        return new Object[] {maBanDoc, hoTen, diaChi, SDT};
    }
}
