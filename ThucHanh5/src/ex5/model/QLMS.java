/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5.model;

import java.io.Serializable;

/**
 *
 * @author minhtanit
 */
public class QLMS implements Serializable{
    private int maBD;
    private int maS;
    private int soLuong;
    private String tinhTrang;

    public QLMS() {
    }

    public QLMS(int maBD, int maS, int soLuong, String tinhTrang) {
        this.maBD = maBD;
        this.maS = maS;
        this.soLuong = soLuong;
        this.tinhTrang = tinhTrang;
    }

    public int getMaS() {
        return maS;
    }

    public void setMaS(int maS) {
        this.maS = maS;
    }

    public int getMaBD() {
        return maBD;
    }

    public void setMaBD(int maBD) {
        this.maBD = maBD;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getTinhTrang() {
        return tinhTrang;
    }

    public void setTinhTrang(String tinhTrang) {
        this.tinhTrang = tinhTrang;
    }
    
    

    @Override
    public boolean equals(Object obj) {
        QLMS t = (QLMS) obj;
        return maS == t.getMaS() && maBD == t.getMaBD();
    }
    
    
}
