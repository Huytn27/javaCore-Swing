///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package ngay1210;
//
//import java.util.Scanner;
//
///**
// *
// * @author User
// */
//public class Menu {
//    public static void main(String[] args) {
//        XuLySo x = null;
//        int n; 
//        while(true){
//            System.out.println("_____menu_______\n"
//                    + "1. nhap n : \n"
//                    + "2. in \n"
//                    + "3. tong \n"
//                    + "4. trung binh \n"
//                    + "5. day nguyen to \n"
//                    + "0. exit \n"
//                    + "moi ban chon : ");
//            Scanner in;
//            in = new Scanner(System.in);
//            int lc = Integer.parseInt(in.nextLine());
//            switch(lc){
//                case 1 : System.out.println("mời bạn nhập :");
//                    n = in.nextInt();
//                    x = new XuLySo(n);
//                    x.input();
//                    break;
//                case 2:
//                    x.outPut();
//                    break;
//                case 3:
//                    System.out.println(x.tong());
//                    break;
//                case 4: System.out.println("tb la :" +x.TB());
//                    break;
//                case 5: 
//                    x.vietNTo();
//                    break;
//                case 0:
//                    System.out.println("bye ");
//                    System.exit(0);
//                    break;
//                default:
//                    System.out.println("nhap từ 0-4");
//            }
//            
//        }
//    }
//}
