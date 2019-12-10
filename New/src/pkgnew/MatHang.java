
package filedemo;

import java.io.Serializable;

public class MatHang implements Serializable{
    private String ma,ten,nhom;
    private double gia;

    public MatHang() {
    }

    public MatHang(String ma, String ten, String nhom, double gia) {
        this.ma = ma;
        this.ten = ten;
        this.nhom = nhom;
        this.gia = gia;
    }

    public String getMa() {
        return ma;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNhom() {
        return nhom;
    }

    public void setNhom(String nhom) {
        this.nhom = nhom;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }
    public Object[] toObject(){
        return new Object[]{
           ma,ten,nhom,gia
        };
    }    
}
