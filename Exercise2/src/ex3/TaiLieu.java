package ex3;

public class TaiLieu {
    protected String id;
    protected String tenNxb;
    protected int soBan;

    public TaiLieu() {
    }

    public TaiLieu(String id, String tenNxb, int soBan) {
        this.id = id;
        this.tenNxb = tenNxb;
        this.soBan = soBan;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTenNxb() {
        return tenNxb;
    }

    public void setTenNxb(String tenNxb) {
        this.tenNxb = tenNxb;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public String toString() {
        return id + '\t' + tenNxb + '\t' + soBan;
    }
}
