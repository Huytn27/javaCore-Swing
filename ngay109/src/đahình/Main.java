/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package đahình;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Empolyee e = new Empolyee();
        Person p = new Empolyee(); // upcasting 
        
        e.setLuong(5);
        e.setTen("huy");
        
        p.setTen("tran");
        // p.setLuong(5); //ko tìm thấy 
        e.thongtin();
        p.thongtin(); // sẽ gọi hàm thongtin trong Empolyee do khai báo ở trên là new Employee => ghi đè runtime
        
        
    }
}
