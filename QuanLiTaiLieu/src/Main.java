


import java.util.Scanner;
import quanlitailieu.TaiLieu;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
//        TaiLieu taiLieu = new TaiLieu();
//        System.out.println(taiLieu.getMaTaiLieu());
//        TaiLieu taiLieu2 = new TaiLieu("TL1", "Nxb1", 1, 1);
//        TaiLieu taiLieu3 = new TaiLieu("TL2", "Nxb2", 2, 2);
//        System.out.println(taiLieu2.getMaTaiLieu());
        Scanner sc = new Scanner(System.in);
        int choose = 1;
        QuanLiTaiLieu quanLiTaiLieu = new QuanLiTaiLieu();
        do {
            QuanLiTaiLieu.showMenu();
            choose = Integer.parseInt(sc.nextLine());
            switch (choose) {
                case 0 :
                     break;
                case 1:
                    quanLiTaiLieu.addTaiLieu();
                        break;
                case 2:
                    quanLiTaiLieu.showAll();
                    break;
                case 3:
                    quanLiTaiLieu.removeTaiLieu();
                    break;
                case 4:
                    quanLiTaiLieu.sortBysoBan();
                    break;
                case 5:
                    quanLiTaiLieu.sortBytenNxb();
                    break;
            }
        }while(choose != 0);
                
    }
}
