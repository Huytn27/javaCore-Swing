/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class SinhVien {
    public String ten ; // khai báo biến toàn cục ten , có giá trị mặc định là NULL
    private int tuoi ; // khai báo biến toàn cục tuoi , có giá mặc định là 0;
    public SinhVien(String ten){
        this.ten = ten ; // sử dụng biến instance trong 1 contructor 
    }
    public void setTuoi(int tuoi){
        this.tuoi = tuoi ;
    }
    public void in(){
        System.out.println("tên : "+ ten);
        System.out.println("tuoi : "+ tuoi );
        
    }
    public static void main(String[] args) {
        SinhVien sv = new SinhVien("tran ngoc huy"); // biến instance dc tạo khi 1 đối tượng
                                                     // dc taọ bằng từ khóa "new"
        sv.setTuoi(20);
        sv.in();
    }
}
