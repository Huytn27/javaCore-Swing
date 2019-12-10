/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vdngay138;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class giaithua {
    private int n;
    Scanner in = new Scanner(System.in);
    public void nhap(){
        System.out.println("moi nhap :");
        n = Integer.parseInt(in.nextLine());
    }
    public int giaithua(){
        int i;
        int gt=1;
        for(i=1;i<=n;i++){
            gt*=i;
        }
        return gt;
    }
    public void inGT(){
        System.out.println("kết quả sẽ là : "+ giaithua());  
    }
//    public void KTnguyenTo(){
//        if(n<2)
//                System.out.println("đây ko là snt");
//        for (int i = 2; i <= Math.sqrt(n); i++) {
//            if(n%i == 0){
//                System.out.println("dday ko la snt");
//            return;
//            
//                
//            }
//        System.out.println("day la so nguyen to");
//        
//}}
    public boolean checkNT(int n){
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i ==  0)
                return false;}
        return true;
            
        }
   
    public void NgTo(){
       if(checkNT(n))
            System.out.println("đÂY LÀ SNTO");
    }
}
