/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoNhoStackHeap;

/**
 *
 * @author User
 */
public class HinhVuong {
   public void chuVi(){
       System.out.println("chu vi");
   } 
   
   public static void xinChao(HinhVuong hinhVuong){ //đối số truyền vào là hinhVuong có kiểu dữ liệu là HinhVuong 
     String s = "xin chao" ;
       System.out.println(s);
     hinhVuong.chuVi();
   }
    public static void main(String[] args) {
        int x = 10;
        System.out.println(x);
        HinhVuong hinhVuong = new HinhVuong();
        xinChao(hinhVuong);
    }
}
