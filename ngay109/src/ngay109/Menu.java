/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay109;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    public static void main(String[] args) {
    BTQT a = new BTQT();
    String ID = null; //biến local phải khai báo giá trị cho nó 
    while(true){
        System.out.println("1.Nhap ma : \n"
                    + "2.Kiem tra ma :\n"
                    + "3.kiem tra sdt : \n"
                    + "0.thoat");
        Scanner in = new Scanner(System.in);
        int lc = Integer.parseInt(in.nextLine());
        switch(lc){    
            case 1:
                System.out.println("moi bạn nhap ma :");
                ID = in.nextLine();
            break;
            case 2:    
                a.ktMa(ID);
                break;
            case 3: 
                String SDT;
                System.out.println("moi ban nhap sdt: ");
                SDT = in.nextLine();
                if(a.ktDT(SDT))
                    System.out.println("so dien thoai ban nhap da dung la : "+ SDT);
                break;
            case 0:
                System.out.println(" cut ");
                System.exit(0);
                break;
                default: System.out.println("chi nhap tu 0 - 3 ");
                
}
}}}  
