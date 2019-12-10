/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemSoTu_TinhBanKinhTrongFile;

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
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\DemSoTu_TinhBanKinhTrongFile\\input.txt"));
            String line = br.readLine();
            String[] t = line.split("\\s+");
            int soTu = t.length;
            
            line = br.readLine();
            double r = Double.parseDouble(line);
            double S = Math.PI * r * r;
            double V = Math.PI * r * r * r * 4/3;
            br.close();
            
            PrintWriter p = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\DemSoTu_TinhBanKinhTrongFile\\output.txt");
            p.println("Số từ trong xâu : "+soTu);
            p.println("Diện tich : "+S);
            p.println("Thể tích hình cầu : "+V);
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
