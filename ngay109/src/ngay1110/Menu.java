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
public class Menu {
    public static void main(String[] args) {
        XuLiSo a = new XuLiSo();
        while(true){
            System.out.println("1. nhập 1 số \n"
                    + "2.tính tổng\n"
                    + "3.tính tích\n"
                    + "4.in dãy nguyên tố \n"
                    + "0. thoat");
            Scanner in = new Scanner(System.in);
            int lc = Integer.parseInt(in.nextLine());
            switch(lc){
                case 1: a.input();
                    break;
                case 2: System.out.println("tong se la : "+ a.tong());
                    break;
                case 3:System.out.println("tich se la : "+ a.tich());
                    break;
                case 4:
                    a.dayNto();
                    break;
                case 0:
                    System.out.println("bye");
                    System.exit(0);
                    break;
                default:
                    System.out.println("chi nhap tu 0 - 4");
                        
                    
                
            }
        }
    }
 
}
