/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1010;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu {
    public static void main(String[] args) {
        MaTran m = null;
        HaiSo a = new HaiSo();
        while(true){
            System.out.println("1.Nhập ma trận : \n"
                    + "2.in ma trận \n"
                    + "3.ma trận chuyển vị\n"
                    + "4.tổng các hàng \n"
                    + "5.nhập 2 số : \n"
                    + "6.in dãy nguyên tố \n"
                    + "7.bội chung nn \n"
                    + "8.kiểm tra thuận nguyên tố \n"
                    + "0.exit "
                    + "mời bạn chọn : ");
            Scanner in = new Scanner(System.in);
            int lc = Integer.parseInt(in.nextLine());
        switch(lc){
            case 1:
                System.out.println("nhap n :");
                int n = in.nextInt();
                m = new MaTran(n);
                m.input();
                break;
            case 2:
                m.out();
                break;
            case 3:
                m.outChuyenVi();break;
            case 4:
                m.outTongHang();break;
            case 5:
                a.input();
                break;
            case 6:
                a.daySNto();
                break;
            case 7:
                a.BCNN();
                break;
            case 8:
                if(a.thuanNto())
                    System.out.println("thuận nguyên tố ");
                else
                    System.out.println("sai ");
                break;
            case 0:
                System.out.println("bye ");
                System.exit(0);
                break;
            default:
                System.out.println("chi nhap tu 0 - 8");
                
        }
    }
}}
