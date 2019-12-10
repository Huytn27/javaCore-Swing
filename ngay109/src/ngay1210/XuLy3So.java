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
public class XuLy3So {
    private double a, b ,c;
    
    public void nhap3So(){
        Scanner in = new Scanner(System.in);
        System.out.println("nhap a: ");
        a = in.nextDouble();
        System.out.println("nhap b: ");
        b = in.nextDouble();
        System.out.println("nhap c: ");
        c = in.nextDouble();
    }
    public void timMaxMin(){
        double max = Math.max(Math.max(a, b),c);
        double min = Math.min(Math.min(a, b),c);
        System.out.println(" max la : "+ max);
        System.out.println(" min la : "+ min);
    }
    public void gptbac2(){
        double dt = b * b - 4 *a*c;
        if(dt < 0)
            System.out.println("pt vô nghiệm ");
        else if(dt == 0){
            double x = (-b / (2 * a));
            System.out.println("phuong trình có nghiệm kép x1 = x2 : "+x);
        if(dt > 0){
            double x1 = (-b + Math.sqrt(dt))/ (4 * a);
            double x2 = (-b - Math.sqrt(dt))/ (4 * a);
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        }    
    }}
    public boolean nTo(long n){
        if(n<2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }

    public boolean nToCungNhau(){
        long x = Math.round(a);
        long y = Math.round(b);
        long z = Math.round(c);
        if(nTo(x) && nTo(y) && nTo(z))
            return true;
        return false;
    
}}
