/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1110;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class XuLiSo {
    private int n;
    public void input(){
        System.out.println("moi nhap so ");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();
    }
    public void tinhTong(){
        int t = 0;
        for (int i = 0; i <= n; i++) {
            t += i;
            
        }
        System.out.println("tong la "+ t);
    }     //ĐÂY LÀ CÁCH 1 SỬ DỤNG HÀM VOID
    public int tong(){ // ĐÂY LÀ CÁCH 2 SỬ DỤNG HÀM INT CÓ TRẢ VỀ 
        int t = 0;
        for (int i = 0; i <= n; i++) {
            t += i;  
        }
        return t;
    }
    public int tich(){
        int t = 1;
        for (int i = 2; i <= n ; i++) {
            t *= i;   
        }
        return t;
    }
    public boolean nTo(int n){
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
                if(n%i == 0)
                    return false;
                
            }
        return true;
    }
    public void dayNto(){
        System.out.println("day so nguyen to la ");
        for (int i = 1; i <= n; i++) {
            if(nTo(i))
                System.out.print( i +" "); 
        }
        System.out.println();
        
    }
        
        
    
    
    
}
