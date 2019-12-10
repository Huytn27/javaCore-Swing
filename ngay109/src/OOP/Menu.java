/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OOP;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    public static void main(String[] args) {
        QuanLiTaiLieu ql = new QuanLiTaiLieu();
        while(true){
            System.out.println("____menu_____\n"
                    + "1.nhap sach \n"
                    + "2.nhap tap chi \n"
                    + "3.sua \n"
                    + "4.xoa \n"
                    + "5.tim kiem \n"
                    + "6.sap xep theo so ban \n"
                    + "7.sap xep theo ten nxb \n"
                    + "8.thong ke \n"
                    + "9. tinh so an pham \n"
                    + "moi ban chon \n");
            Scanner in = new Scanner(System.in);
            int chon = Integer.parseInt(in.nextLine());
            switch(chon){
                case 1:
                    ql.nhapSach();
                    break;
                case 2:
                    ql.nhapTapChi();
                    break;
                case 3:
                    ql.suaTaiLieu();
                    break;
                case 4:
                    ql.xoaTaiLieu();
                    break;
                case 5:
                    ql.timKiem();
                    break;
                case 6:
                    ql.sortBysoBan();
                    break;
                case 7:
                    ql.sortBytenNxb();
                    break;
                case 8: 
                    ql.thongKe();
                    break;
                case 9:
                    
                    System.out.println("tong an pham la " + ql.tinhTongAnPham());
                    break;
            }
        }
    }
}
