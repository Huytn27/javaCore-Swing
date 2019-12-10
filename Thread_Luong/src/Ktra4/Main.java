
package Ktra4;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {
    private static boolean tang(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i+1]<a[i])
                return false;
            
        }
        return true;
    }
    private static boolean giam(int[] a){
        for (int i = 0; i < a.length; i++) {
            if(a[i+1]>a[i])
                return false;
            
        }
        return true;
    }
    
    private static boolean check(int[] a){
        if(tang(a) || giam(a))
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        int[] a,b;
        try {
            BufferedReader fr = new BufferedReader(new FileReader("src/Ktra4/input.txt"));
            String line = fr.readLine();
            String[] s = line.split("\\s+");
            a = new int[s.length];
            b = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                a[i] = Integer.parseInt(s[i]);
                
            }
            
            line = fr.readLine();
            for (int i = 0; i < s.length; i++) {
                b[i] = Integer.parseInt(s[i]);
            }
            fr.close();
            
            PrintWriter w = new PrintWriter("src/Ktra4/kq.dat");
            if(check(a))
                w.println("day thu nhat da sx");
            else
                w.print("day chua sap xep");
            if(check(b))
                w.println("day thu hai da sx");
            else
                w.print("day chua sap xep");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch(IOException e){
            System.out.println(e);
        }
}}
