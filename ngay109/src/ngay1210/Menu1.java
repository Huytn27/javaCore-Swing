/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1210;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Menu1 {
    public static void main(String[] args) {
        XuLy3So x = new XuLy3So();
        MaTran m1 = null; // cần 1 ma trận để lấy làm gốc
        MaTran t = null;    // cần 1 ma trận để lưu kết quả tổng tích hiệu 2 ma trận vào
        int n = 0;
        XuLyXau h = new XuLyXau();
        while(true){
            System.out.println("_______menu________\n"
                    + "1.nhập 3 số \n"
                    + "2.giải pt bậc 2\n"
                    + "3.kiểm tra 3 số nguyên tố \n"
                    + "4.nhập ma trận\n"
                    + "5.tổng\n"
                    + "6.hiệu\n"
                    + "7.tích\n"
                    + "8.nhập xâu\n"
                    + "9.kiểm tra đt\n"
                    + "10.kiểm tra phiếu \n"
                    + "0.exit\n"
                    + "mời bạn chọn : ");
            Scanner in = new Scanner(System.in);
            int lc = Integer.parseInt(in.nextLine());
            switch(lc){
                case 1:
                    x.nhap3So();break;
                case 2:
                    x.gptbac2();break;
                case 3:
                    if(x.nToCungNhau())
                        System.out.println("dung");
                    System.out.println("sai");
                    break;
                case 4:
                    System.out.println("nhap kich thuoc ma trận ");
                    n = in.nextInt();// nhập kích thước n cho ma trận 
                    m1 = new MaTran(n);// khởi tạo m1 có kiểu MaTran trong contructor;
                    m1.nhap();
                    break;
                case 5:
                    MaTran b = new MaTran(n);
                    b.nhap();
                    t = new MaTran(n);
                    t.setA(m1.tong(b.getA()));
                    m1.xuat();
                    b.xuat();
                    t.xuat();
                    break;
                case 6:
                    MaTran c = new MaTran(n);
                    t = new MaTran(n);
                    c.nhap();
                    t.setA(m1.hieu(c.getA()));
                    m1.xuat();
                    c.xuat();
                    t.xuat();
                    break;
                case 7:
                    MaTran d = new MaTran(n);
                    d.nhap();
                    t = new MaTran(n);
                    t.setA(m1.tich(d.getA()));
                    m1.xuat();
                    d.xuat();
                    t.xuat();
                case 8:
                    h.nhapXau();
                    break;
                case 9:
                    if(h.ktraMa())
                        System.out.println("dung");
                    System.out.println("sai");
            }
        }
    }
    
    
}
