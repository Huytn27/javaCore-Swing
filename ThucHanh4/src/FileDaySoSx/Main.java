
package FileDaySoSx;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Main {
    private static boolean tang(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i+1] < a[i])
                return false;
            
        }
        return true;
    }
    
    private static boolean giam(int[] a){
        for (int i = 0; i < a.length - 1; i++) {
            if(a[i+1] > a[i])
                return false;
            
        }
        return true;
    }
    
    private static boolean check(int[] a){
        if(tang(a) || giam(a))
            return true;
        return false;
    }
    
    private static void sxTangDan(int[] a){
        int tem = a[0];
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] < a[i]){
                    tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                }
                
            }
            
            
        }
    }
    private static void sxGiamDan(int[] a){
        int tem = a[0];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if(a[j] > a[i])
                    tem = a[j];
                    a[j] = a[i];
                    a[i] = tem;
                
            }
            
            
        }
    }
    

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\FileDaySoSx\\input.txt"));
            String line = br.readLine();//đọc dòng đầu tiên
            int[] a, b;
            String[] t = line.split("\\s+");
            a = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                a[i] = Integer.parseInt(t[i]);
                
            }
            
            line = br.readLine(); //đọc dòng thứ 2;
            t = line.split("\\s+");
            b = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                b[i] = Integer.parseInt(t[i]);
                
            }
            br.close();
            
            PrintWriter p = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\FileDaySoSx\\output.txt");
            if(check(a))
                p.println("Dãy đã sx");
            else{
                p.println("Dãy chưa sx");
                sxTangDan(a); //sx lại
                p.print("sx lại dãy theo chiều tăng dần : ");
                for (int i = 0; i < a.length; i++) {
                    p.print(a[i] + " ");
                    
                }
                p.println();
                
                sxGiamDan(a);//sx lại
                p.print("sx lại dãy theo chiều giảm dần : ");
                for (int i = 0; i < a.length; i++) {
                    p.print(a[i] + " ");
                    
                }
                p.println();
            }
            
            if(check(b))
                p.println("Dãy 2 đã sx");
            else{
                p.println("Dãy 2 chưa sx");
                sxTangDan(b);
                p.print("sx lại dãy 2 theo chiều tăng dần : ");
                for (int i = 0; i < b.length; i++) {
                    p.print(b[i] + " ");
                    
                }
                p.println();
                
                sxGiamDan(b);
                p.print("sx lại dãy 2 theo chiều giảm dần : ");
                for (int i = 0; i < b.length; i++) {
                    p.print(b[i] + " ");
            }
                p.println();
                
            p.close();
            }} catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
