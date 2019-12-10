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
public class TapChi extends TaiLieu{
    private String maPhatHanh;
    private int thangPhatHanh;

    public TapChi() {
    }

    public TapChi(String maPhatHanh, int thangPhatHanh) {
        this.maPhatHanh = maPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi(String maPhatHanh, int thangPhatHanh, String maTaiLieu1, String tenNxb1, int soBan1) {
        super(maTaiLieu1, tenNxb1, soBan1);
        this.maPhatHanh = maPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "TapChi{" + "maPhatHanh=" + maPhatHanh + ", thangPhatHanh=" + thangPhatHanh + '}' + super.toString();
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
    
    
    
    
}
