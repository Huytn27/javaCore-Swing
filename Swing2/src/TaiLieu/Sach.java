/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TaiLieu;

/**
 *
 * @author User
 */
public class Sach extends TaiLieu{
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

    public Sach(String tenSach, String tenTg, int soTrang, String maTaiLieu, String tenNxb, int soBan) {
        super(maTaiLieu, tenNxb, soBan);
        this.tenSach = tenSach;
        this.tenTg = tenTg;
        this.soTrang = soTrang;
    }
    
    public Object[] toObjects(){
        return new Object[] {tenSach, tenTg, soTrang, maTaiLieu, tenNxb, soBan};
    }
}
