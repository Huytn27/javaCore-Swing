/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1110;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class cachTan {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = 0;
        int lc = 0;
        do{
            menu();
            lc = in.nextInt();
            switch(lc){
                case 1:
                    System.out.println("moi ban nhap so n : ");
                    n = in.nextInt();
                    break;
                case 2:
                    System.out.println(tong(n));
                    break;
                case 3:
                    System.out.println(tich(n));
                    break;
                case 0:
                    System.out.println("bye ");
                    System.exit(0);
                    break;
                default: System.out.println("nhap tu 0 - 3");
            }
        }while(lc!=0);
    }
    
    
    private static int tong(int n){
        return n * (n + 1)/2;
        
    }
    private static int tich(int n){
        if(n <= 1)
            return 1;
        return n * tich (n - 1);
    }    
    public static void menu(){
        System.out.println("_______Menu___________\n"
                + "1.Nhap n : \n"
                + "2. tinh tong :\n"
                + "3.tinh tich : \n"
                + "0. exit \n"
                + "moi ban chon : "); 
    }
}
