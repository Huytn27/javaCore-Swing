/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GiaiPTBac2_Tong3So;

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
            BufferedReader br = new BufferedReader(new FileReader("src/GiaiPTBac2_Tong3So/input.txt"));
            String line = br.readLine();
            String[] t = line.split("\\s+");
            double a = Double.parseDouble(t[0]);
            double b = Double.parseDouble(t[1]);
            double c = Double.parseDouble(t[2]);
            double delta = (b*b)-(4*a*c);
            double x1 = (-b + Math.sqrt(delta))/(2*a);
            double x2 = (-b - Math.sqrt(delta))/(2*a);
            double x = -b/(2*a);
            br.close();
            PrintWriter p = new PrintWriter("src/GiaiPTBac2_Tong3So/output.txt");
            p.println("Tổng 3 số là " + (a + b + c));
            if(delta < 0)
                p.println("pt vo nghiem");
            else if(delta == 0)
                p.println("pt có 1 nghiệm duy nhất : " + x);
            else 
                p.print("pt có 2 nghiêm : x1 = " + x1 + " x2 = " + x2);
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
