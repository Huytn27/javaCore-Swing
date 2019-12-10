/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1010;

import java.util.Scanner;
import java.util.Arrays;


public class MaTran{
    private final int[][] a;
    
    public MaTran(int n){
        a = new int[n][n];
}
    
    public void input(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("nhap " + i +" "+ j + " :");
                a[i][j] = in.nextInt();   
            }   
        }  
    }
    public void out(){
        for (int i = 0; i < a.length; i++) {
            System.out.println(Arrays.toString(a[i]));
            
        }
    }
    private int[][] chuyenVi(){
        int[][] t = new int[a.length][a.length];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t[j][i] = a[i][j];
            }
            }
        return t;
        }
    public void outChuyenVi(){
        int[][] t = chuyenVi();
        for (int i = 0; i < t.length; i++) {
            System.out.println(Arrays.toString(t[i]));
        }
        
    }
    private int[] tongHang(){
        int[] t = new int[a.length];
        for (int i = 0; i < t.length; i++) {
            t[i] = 0;
            for (int j = 0; j < t.length; j++) {
                t[i] += a[i][j];
                
            }
        }
        return t;
    }
    public void outTongHang(){
        int[] t = tongHang();
            System.out.println(Arrays.toString(t)); // in ra hàng thôi ko cần for 
        }
    }
    
    
    
    
    
    
    
    
     
    

