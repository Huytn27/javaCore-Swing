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
public class XuLySo {
    int[] a;
    public XuLySo(int n){
        a = new int[n];
    }
    
    public void input(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            System.out.print("nhập phần tử "+ (i + 1) + ": ");
            a[i] = in.nextInt();
            
        }
    }
    public void outPut(){
        System.out.println("dãy vừa nhập là : ");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i]+"  ");
            
        }
        System.out.println();
    }
    public int tong(){
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            t += a[i]; 
        }
        return t;
}
    public double TB(){
      double t = 0;
      t = (double)tong()/a.length;
      return t;
    }
    
    public boolean nTo(int n){
       if(n < 2 )
           return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
        }
        return true;
    }
    public void vietNTo(){
        System.out.print("day nguyen to se la ");
        for (int i = 0; i < a.length; i++) {
            if(nTo(a[i]))
                System.out.print(a[i] + "  ");
        }
        System.out.println();    
        }
}
