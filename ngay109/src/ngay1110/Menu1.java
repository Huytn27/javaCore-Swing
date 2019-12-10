/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1110;

/**
 *
 * @author User
 */
public class Menu1 {
    public static void main(String[] args) {
        SinhVien sv;
        sv = new SinhVien("b17", "huy", "hải dương", 20,3.0, true);// truền dữ liệu cho đối tượng
        System.out.println(sv.toString());// gọi hàm to String sau khi truyền data
    }
    
}
