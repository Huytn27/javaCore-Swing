/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1210;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class MaTran {
    private int[][] a;
    
    public MaTran(int n){
        a = new int[n][n];
    }

    public int[][] getA() {
        return a; // lấy ma trận a
    }

    public void setA(int[][] b) {
        a = b; // gán ma trận a = b
    }
    
    public void nhap(){
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                System.out.println("nhap phan tu "+i+ " "+j+" : ");
                a[i][j] = in.nextInt();  
        }}
    }
    public void xuat(){
        System.out.println("ma tran vua nhap la : ");
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
    }
}
    public void xuat2(){ // cach 2
        for (int i = 0; i < a.length; i++) {
            System.out.println("ma tran vua nhap : "+ Arrays.toString(a[i]));
            
        }
    }
    public int[][] tong(int[][] b){
        int[][] t = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                t[i][j] = a[i][j] + b[i][j];
                
            }
        }
        return t;
    }
    public int[][] hieu(int[][] b){
        int[][] t = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                t[i][j] = a[i][j] - b[i][j];
                
            }
        }
        return t;
    }
    public int[][] tich(int[][] b){
       int[][] t = new int[a.length][a.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a.length; k++) {
                    t[i][j] = a[i][k] * b[k][j];
                    
                }
            
        }
               
    }return t;
    
}}
   