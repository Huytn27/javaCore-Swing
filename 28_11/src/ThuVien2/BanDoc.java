/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThuVien2;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class BanDoc implements Serializable{
    private int maBD, SDT;
    private String hoTen, diaChi;

    public BanDoc(int maBD, String hoTen, String diaChi,int SDT) {
        this.maBD = maBD;
        this.SDT = SDT;
        this.hoTen = hoTen;
        this.diaChi = diaChi;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public int getSDT() {
        return SDT;
    }

    public void setSDT(int SDT) {
        this.SDT = SDT;
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
    
    public Object[] toObjects(){
        return new Object[] {maBD,hoTen,diaChi,SDT};
    }
}
