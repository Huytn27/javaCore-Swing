/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author User
 */
public class classString {
    public static void main(String[] args) {
        String a = "huy";
        String n = null;
        String e = String.valueOf(1.23);
        String b = new String();
        String c = new String("huy");
        
        System.out.println(1 + 2 + 3);
        
        String name ="Ly Lao Lo";
        String name1 ="Huy";
        
        System.out.println("đổi chữ hoa thành thường:"+name.toLowerCase());
        System.out.println("đổi chữ thường thành hoa:"+name.toUpperCase());
        System.out.println("      xoa khoảng trắng ".trim());
        
        int var = name.compareTo(name1);
        // dùng compareToIgnoreCase để ss ko phân biệt chữa hoa hay thường;
        System.out.println(var); // return về 1 số âm nếu chuỗi 1 < chuỗi 2 ; dương nếu chuỗi 1 > chuỗi 2; return 0 nếu chuỗi 1 = 2;
        System.out.println(name.equals(name1)); // equals giống nhau return true ; khác return false
                                                // equalsignoreCase ko phân biệt hoa hay thường;
    }
                
}
