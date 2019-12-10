/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1310;

/**
 *
 * @author User
 */
public class Employee extends Person{
    String ten;
    
    public void thongTin(){
        this.ten = "B";
        System.out.println("ten cua class con la " + this.ten);
        super.thongTin(); // goi den ham cua class cha
    }
    
}
