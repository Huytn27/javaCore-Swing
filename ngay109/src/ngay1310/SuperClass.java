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
public class SuperClass {
     public int tong2So(int a, int b){
         return a + b;
     }
     // overloading nạp chồng : tên phương thức giống nhau nhưng đôi số truyền vào khác nhau
     public long Tong2So(long a, long b){
         return a + b;      
     }
     
     public static void main(String[] args) {
        SuperClass sup = new SuperClass();
        sup.tong2So(5, 5);
        sup.Tong2So(5 , 5L);//phương thức 2;    
    }
    
}
