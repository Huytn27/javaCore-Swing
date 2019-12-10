package ex3;


public class Sach extends TaiLieu implements CaiDat {
    
private String tacGia;
    
private String ten;
    
private int soTrang;

    
public Sach() {
    
}

    
public Sach(String tacGia, String ten, int soTrang) {
        
this.tacGia = tacGia;
        
this.ten = ten;
        
this.soTrang = soTrang;
    }

    
public Sach(String id, String tenNxb, int soBan, String tacGia, String ten, int soTrang) {
        super(id, tenNxb, soBan);
        this.tacGia = tacGia;
        this.ten = ten;
        this.soTrang = soTrang;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getSoTrang() {
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return  super.toString() + "\t" + tacGia + "\t" + ten + "\t" + soTrang;
    }
}
