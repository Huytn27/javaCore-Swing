/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th;

/**
 *
 * @author User
 */
public class Sach {
    // mã , tên tác giả , tên sách , số trang
    private String ten,tgia,ma;
    private int strang;
    public Sach(){
    }
    public Sach(String ma,String ten,String tgia,int strang){
        this.ma = ma ;
        this.ten = ten ;
        this.strang = strang;
        this.tgia = tgia;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public void setTgia(String tgia) {
        this.tgia = tgia;
    }

    public void setMa(String ma) {
        this.ma = ma;
    }

    public void setStrang(int strang) {
        this.strang = strang;
    }

    public String getTen() {
        return ten;
    }

    public String getTgia() {
        return tgia;
    }

    public String getMa() {
        return ma;
    }

    public int getStrang() {
        return strang;
    }
    @Override
    public String toString(){
        return ma+"\t"+ten+"\t"+tgia+"\t"+strang;
    


}}
