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
public class XuLyXau {
   private String xau;
   
   public void nhapXau(){
       System.out.println("mời nhập xâu ");
       Scanner in = new Scanner(System.in);
       xau = in.nextLine();
   }
   public void inXau(){
       System.out.println(xau);
   }
   public boolean ktraDT(){
       String reg="^0\\d{9}$";
//       
    return xau.matches(reg);
   }
   public boolean ktraMa(){
       return xau.matches("^[XxNn]{1}\\d{4}[A-Za-z]{1}\\d{2}$");    
   }
 
}
