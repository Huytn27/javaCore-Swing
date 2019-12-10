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
public class Sach extends TaiLieu implements TinhSoAnPham{
    String tenSach;
    String tenTg;
    int soTrang;

    public Sach() {
    }

    public Sach(String tenSach, String tenTg, int soTrang) {
        this.tenSach = tenSach;
        this.tenTg = tenTg;
        this.soTrang = soTrang;
    }

    public Sach(String tenSach, String tenTg, int soTrang, String maTaiLieu, String tenNxb, int soBan) {
        super(maTaiLieu, tenNxb, soBan);
        this.tenSach = tenSach;
        this.tenTg = tenTg;
        this.soTrang = soTrang;
    }

    public String getTenSach() {
        return tenSach;
    }

    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTg() {
        return tenTg;
    }

    public void setTenTg(String tenTg) {
        this.tenTg = tenTg;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach : " + "tenSach=" + tenSach + ", tenTg=" + tenTg + ", soTrang=" + soTrang +  super.toString();
    }

    @Override
    public double tinhAnPham() {
        if(getSoBan() < 500)
            return getSoBan()*0.1;
        return getSoBan()*0.2;

    }
}

 



    

    
    
    
    

        
