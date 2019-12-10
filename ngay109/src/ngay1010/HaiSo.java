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
public class HaiSo {
    private int a,b;
    public void input(){
        Scanner in = new Scanner(System.in);
        System.out.println("nhap a = ");
        a = in.nextInt();
        System.out.println("Nhap b = ");
        b = in.nextInt();
           
    }
    public boolean nTo(int n){
        if(n < 2)
            return false;
        if(n > 2){
            for (int i = 2; i < Math.sqrt(n); i++) {
                if(n % i == 0)
                    return false;
                
            }
        }
        return true;
        }
    public void daySNto(){
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        for ( int i = min; i <= max; i++) {
            if(nTo(i))
                System.out.println("day so nguen to la : "+ i + "  " );
            
        }
        System.out.println();
    }
    public void BCNN(){
        for (int i = Math.max(a, b); i <= (a*b); i++) {
            if(( i % a == 0)&&( i % b == 0))
                System.out.println("BCNN la : " + i);
                break;
        }
    }
    public boolean thuanNto(){
        if( nTo(a) && nTo(b) && nTo( a + b))
            return true;
        return false;
    }
    
    
}
