/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package In_TongDaySo_DaySoNgToFile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Main {
    private static int tong(int[] a){ // trả về 1 int tổng
        int tong = 0;
        for (int i = 0; i < a.length; i++) {
            tong += a[i];
            
        }
        return tong;
    }
    
    private static boolean checkNTo(int n){
        if(n < 2)
            return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if(n % i == 0)
                return false;
            
        }
        return true;
    }
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\In_TongDaySo_DaySoNgToFile\\input.txt"));
            String line = br.readLine();
            String[] t = line.split("\\s+");
            int[] a = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                a[i] = Integer.parseInt(t[i]);
                
            }
            br.close();
            
            PrintWriter p = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\In_TongDaySo_DaySoNgToFile\\output.txt");
            p.println("tong dãy số là " + tong(a));
            p.print("Dãy số nguyên tố là : ");
            for (int i = 0; i < a.length; i++) {
                if(checkNTo(a[i])){
                    p.print(a[i] + " ");
                }
                    
                
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
