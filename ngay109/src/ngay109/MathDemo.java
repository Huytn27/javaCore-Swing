/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay109;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MathDemo {
    public static void main(String[] args) {
//        Random r = new Random();
//        System.out.println("random so tu 0 - 7 :  "+ r.nextInt(8));
//        System.out.println("random so tu 1 - 8  : "+ (r.nextInt(8) + 1));
//        System.out.println("sin 30 :  " + Math.sin(Math.PI / 6));
//        System.out.println("ceil "+ Math.ceil(8.2)); // làm tròn lên 
//        System.out.println("floor  "+Math.floor(8.7)); // làm tròn xuống
//        System.out.println("round  "+Math.round(8.2));// làm tròn gần nhất
        String ma = null , ten= " ";
        int tuoi = 0 ;
        boolean ut = false;
        double diem = 0.0;
        char chon;
        Scanner in = new Scanner(System.in);
        while(true){
            System.out.println("Nhap ma ");
            ma = in.nextLine();
            System.out.println("Nhap tuoi");
            tuoi = Integer.parseInt(in.nextLine()); // dùng cái này để nhập cho kiểu int để có thể nhập mấy cái sau dùng nextline
            System.out.println("Nhap ten ");
            ten = in.nextLine();
            System.out.println("uu tien ");
            ut = Boolean.parseBoolean(in.nextLine());// thằng boolean nó ko hiểu dc phím enter nên phải dùng parse
            System.out.println("diem ");
            diem = Double.parseDouble(in.nextLine());
            System.out.println("co nhap nua ko ? < C / K > ");
            if((chon = in.nextLine().trim().toUpperCase().charAt(0)) == 'K')
                break;
            }
        System.out.println("ma "+ma + "  tuoi  " + tuoi +" ten " + ten + " uu tien  "+ ut+ " diem "+ diem);
        
        
        
        
        
    }
}
