/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StringEx;

/**
 *
 * @author User
 */
public class khoangtrang {
    public static void main(String[] args) {
        String s = "          Nguyen    tran   linh    an   buyb ";
        s = s.trim();// xóa space đầu cuối
        while(s.indexOf("  ") != -1){
            s = s.replaceAll("  ", " ");}
        System.out.println(s);
        // cách 2 dùng regex /s=+ : dấu space xuất hiện 1 hoặc nhiều lần
        String str =  "  nhat tran    ax bban    ";
        str = str.trim();
        str = str.replaceAll("\\s+", " ");
        System.out.println(str);
        //cách 3
    }
}
