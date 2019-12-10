/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhGiaTriDaThuc;

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
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\TinhGiaTriDaThuc\\input.txt"));
            String line = br.readLine();
            int bac = Integer.parseInt(line);
            
            line = br.readLine();
            String[] t = line.split("\\s+");
            int[] a = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                a[i] = Integer.parseInt(t[i]);
                
            }
            
            br.close();
            
            PrintWriter p = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\TinhGiaTriDaThuc\\output.txt");
            p.print("Gia tri da thuc tai x = 1 : ");
            int giaTri = 0;
            for (int i = 0; i < a.length; i++) {
                giaTri += a[i];
                
            }
            p.println(giaTri);
            
            int giaTri2 = 0;
            for (int i = 0; i < a.length; i++) {
                giaTri2 += a[i] * (bac - i);
                
            }
            p.print(giaTri2);
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
