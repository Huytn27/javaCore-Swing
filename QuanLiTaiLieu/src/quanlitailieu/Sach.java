/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlitailieu;

/**
 *
 * @author User
 */
public class Sach extends TaiLieu implements TinhSoAnPham{
    private String tenSach;
    private String tenTg;
    private int soTrang;

    public Sach() {
    }

    public Sach(String tenSach, String tenTg, int soTrang) {
        this.tenSach = tenSach;
        this.tenTg = tenTg;
        this.soTrang = soTrang;
    }

    public Sach(String tenSach, String tenTg, int soTrang, String maTaiLieu1, String tenNxb1, int soBan1) {
        super(maTaiLieu1, tenNxb1, soBan1);
        this.tenSach = tenSach;
        this.tenTg = tenTg;
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "Sach{" + "tenSach=" + tenSach + ", tenTg=" + tenTg + ", soTrang=" + soTrang + '}' + super.toString();
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
    public void tinh() {
        if(soBan < 500 )
            soAnPham = (int)(soBan * 0.1) ;
        else
            soAnPham = (int)(soBan * 0.2) ;
    }
    
    
    
    
    
    
}
