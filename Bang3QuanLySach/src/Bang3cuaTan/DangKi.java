/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.io.Serializable;

/**
 *
 * @author minhtanit
 */
public class DangKi implements Serializable{
    private int maSinhVien;
    private String tenSinhVien;
    private int maMonHoc;
    private String tenMonHoc;
    private String timeDk;

    public DangKi() {
    }

    public DangKi(int maSinhVien, String tenSinhVien, int maMonHoc, String tenMonHoc, String timeDk) {
        this.maSinhVien = maSinhVien;
        this.tenSinhVien = tenSinhVien;
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.timeDk = timeDk;
    }

    public int getMaSinhVien() {
        return maSinhVien;
    }

    public void setMaSinhVien(int maSinhVien) {
        this.maSinhVien = maSinhVien;
    }

    public String getTenSinhVien() {
        return tenSinhVien;
    }

    public void setTenSinhVien(String tenSinhVien) {
        this.tenSinhVien = tenSinhVien;
    }

    public int getMaMonHoc() {
        return maMonHoc;
    }

    public void setMaMonHoc(int maMonHoc) {
        this.maMonHoc = maMonHoc;
    }

    public String getTenMonHoc() {
        return tenMonHoc;
    }

    public void setTenMonHoc(String tenMonHoc) {
        this.tenMonHoc = tenMonHoc;
    }

    public String getTimeDk() {
        return timeDk;
    }

    public void setTimeDk(String timeDk) {
        this.timeDk = timeDk;
    }
    
    public Object[] toObjects() {
        return new Object[] {maSinhVien, tenSinhVien, maMonHoc, tenMonHoc, timeDk};
    }

//    @Override
//    public boolean equals(Object obj) {
//        DangKi dk = (DangKi) obj;
//        return dk.getMaMonHoc() == this.getMaMonHoc() && dk.getMaSinhVien() == this.getMaSinhVien();
//    }
    
    
}
