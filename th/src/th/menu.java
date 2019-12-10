/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package th;

/**
 *
 * @author User
 */

import java.util.Scanner;
public class menu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       QLSach ql = new QLSach();
       while(true){
           System.out.println("1.Nhap");
           System.out.println("2.Xuat");
           System.out.println("3.Sua");
           System.out.println("4.Xoa");
           System.out.println("5.Tim kiem theo ten sach");
           System.out.println("6.Thong ke theo tac gia");
           System.out.println("Moi chon");
           int chon;
           Scanner in = new Scanner(System.in);
           chon = Integer.parseInt(in.nextLine());
           switch(chon){
               case 1:ql.nhap();
                    break;
               case 2:ql.hthi();
                    break;
               case 3:ql.sua();
                    break;
               case 4:ql.xoa();
                    break;
               case 5:ql.timTheoTen();
                    break;
               case 6:ql.thongke();
                    break;
               case 0:
                   System.out.println("bye");
                   System.exit(0);
                   break;
               default : System.out.println("chỉ nhập từ 1-10");
           }
            
       
       
       }
    }
    
}
