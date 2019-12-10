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
public class MonHoc implements Serializable{
    private int maMonHoc;
    private String tenMonHoc;
    private int soTiet;
    private String loaiMonHoc;

    public MonHoc() {
    }

    public MonHoc(int maMonHoc, String tenMonHoc, int soTiet, String loaiMon) {
        this.maMonHoc = maMonHoc;
        this.tenMonHoc = tenMonHoc;
        this.soTiet = soTiet;
        this.loaiMonHoc = loaiMon;
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

    public int getSoTiet() {
        return soTiet;
    }

    public void setSoTiet(int soTiet) {
        this.soTiet = soTiet;
    }

    public String getLoaiMonHoc() {
        return loaiMonHoc;
    }

    public void setLoaiMonHoc(String loaiMonHoc) {
        this.loaiMonHoc = loaiMonHoc;
    }
    
    public Object[] toObjects() {
        return new Object[] {maMonHoc, tenMonHoc, soTiet, loaiMonHoc};
    }
}
