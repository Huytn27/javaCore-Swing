/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WrapperAutoBoxing;

/**
 *
 * @author User
 */
public class Wrapper {
    public static void main(String[] args) {
        int x = 10;// x là kiểu dữ liệu cơ bản
        Integer y = new Integer(15); // dùng wrapper class để khai báo kiểu dữ liệu tham chiếu với biến tên y;
        int z = x + y;// autoboxing cụ thể đây là unboxing : y đã chuyển từ Integer về int để cộng ;
        System.out.println(z);
        
        //wrapper class chuyển kiểu dữ liệu từ String về int
        int z1 = Integer.valueOf("45");
        int z2 = Integer.parseInt("67");
        System.out.println(z1 + "  "+ z2);
        
        Integer k = 10; //boxing chuyển k từ Int về integer;        
        k = new Integer(10); // tg đương;
        
        int x1 =10;
        int x2 = 10;
        Integer x3 = 10;
        
        System.out.println(x1==x2);
        System.out.println(x1==x3);
        
        Integer k1 = new Integer(10);
        Integer k2 = new Integer(10);
        int k3 = 10;
        System.out.println(k1 == k2);// k1 ko baằng k2 do đây là 2 đối tượng , nó so sánh địa chỉ bộ nhớ 
        System.out.println(k1 == k3); // sẽ bằng nhau so k3 sẽ unboxing về kiểu int
    }
    
    
}
