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
public class TapChi extends TaiLieu implements TinhSoAnPham{
  String maPhatHanh;
  int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maPhatHanh, int thangPhatHanh) {
        this.maPhatHanh = maPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maPhatHanh, int thangPhatHanh, String maTaiLieu, String tenNxb, int soBan) {
        super(maTaiLieu, tenNxb, soBan);
        this.maPhatHanh = maPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public String getMaPhatHanh() {
        return maPhatHanh;
    }

    public void setMaPhatHanh(String maPhatHanh) {
        this.maPhatHanh = maPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi : " + "maPhatHanh=" + maPhatHanh + ", thangPhatHanh=" + thangPhatHanh +  super.toString();
    }

    @Override
    public double tinhAnPham() {
        if(getSoBan() > 500)
            return getSoBan()*0.05;
        return getSoBan()*0.1;        
    }


    
    
  
}
