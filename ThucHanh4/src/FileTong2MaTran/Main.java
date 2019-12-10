
package FileTong2MaTran;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;




public class Main { //đọc 2 ma trận , in ra file tổng 2 ma trận
    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\FileTong2MaTran\\input.txt"));
            int[][] a, b;
            String line = br.readLine();
            String[] t = line.split("\\s+"); //đọc vào 1 dòng xong nhớ split thành 1 mảng
            int cot, hang;
            cot = Integer.parseInt(t[0]);
            hang = Integer.parseInt(t[1]);
            a = new int[cot][hang];
            b = new int[cot][hang];
            
            //đọc ma trận thứ nhất từ file , rồi lưu vào mảng a
            for (int i = 0; i < cot; i++) {
                line = br.readLine(); // chỉ cần 1 vòng for đầu và dòng này ta đã đọc dc hết dữ liệu của mảng 1
                t = line.split("\\s+");
                for (int j = 0; j < hang; j++) {
                    a[i][j] = Integer.parseInt(t[j]); // chuyển mảng t từ String sang int rồi lưu vào mảng a;
                    
                }
            }
            
            for (int i = 0; i < cot; i++) {
                line = br.readLine();
                t = line.split("\\s+");
                for (int j = 0; j < hang; j++) {
                    b[i][j] = Integer.parseInt(t[j]);
                    
                }
            }
            br.close();
            
            PrintWriter p = new PrintWriter("C:\\Users\\User\\Documents\\NetBeansProjects\\ThucHanh4\\src\\FileTong2MaTran\\output.txt");
            for (int i = 0; i < cot; i++) {
                for (int j = 0; j < hang; j++) {
                    p.print(a[i][j] + b[i][j] + " ");
                    
                }
                p.println();
                
            }
            p.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
