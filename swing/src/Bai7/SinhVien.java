package Bai7;
public class SinhVien {
    String maSV, hoVaTen;
    int tuoi, diem;
    public SinhVien() {
    }
    public SinhVien(String maSV, String hoVaTen, int tuoi, int diem) {
        this.maSV = maSV;
        this.hoVaTen = hoVaTen;
        this.tuoi = tuoi;
        this.diem = diem;
    }
    public Object[] toObjects(){
        return new Object[] {maSV, hoVaTen, tuoi, diem};
    }
// dung get va set
//    public String getMaSV() {
//        return maSV;
//    }
//    public void setMaSV(String maSV) {
//        this.maSV = maSV;
//    }
//    public String getHoVaTen() {
//        return hoVaTen;
//    }
//    public void setHoVaTen(String hoVaTen) {
//        this.hoVaTen = hoVaTen;
//    }
//    public int getTuoi() {
//        return tuoi;
//    }
//    public void setTuoi(int tuoi) {
//        this.tuoi = tuoi;
//    }
//
//    public int getDiem() {
//        return diem;
//    }
//
//    public void setDiem(int diem) {
//        this.diem = diem;
//    }
    
    
}
