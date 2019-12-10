/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1TH4;

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
    public static boolean tang(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1] < a[i])
                return false;
            
        }
        return true;
    }
    
    public static boolean giam(int[] a){
        for (int i = 0; i < a.length-1; i++) {
            if(a[i+1] > a[i])
                return false;
            
        }
        return true;
    }
    
    public static boolean check(int[] a){
        if(tang(a)||giam(a))
            return true;
        else return false;
    }
        
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\New\\src\\Bai1TH4\\new.txt"));
            String line = br.readLine();
            int[] a, b;
            String[] t = line.split("\\s+");
            a = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                a[i] = Integer.parseInt(t[i]);
                
            }
            
            t = line.split("\\s+");
            b = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                b[i] = Integer.parseInt(t[i]);
                
            }
            br.close();
            
            PrintWriter p = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\New\\src\\Bai1TH4\\kq.txt");
            if(check(a))
                p.println("dãy đã dc sx");
            else
                p.println("day chưa dc sx");
            if(check(b))
                p.println("dãy đã dc sx");
            else
                p.println("day chưa dc sx");
            p.close();// nhớ close ko là ko chạy dc main  
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
