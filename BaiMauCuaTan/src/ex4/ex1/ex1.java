/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Reader;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minhtanit
 */
public class ex1 { // doc 2 ma tran, in ra file tong 2 ma tran
    private final static String input = "src/ex1/input.txt";
    private final static String output = "src/ex1/output.txt";
    
    public static void main(String[] args) {
        BufferedReader bufferedReader = null;
        PrintWriter printWriter = null;
        int[][] a = null, b = null;
        int m = 0, n = 0;
        
        // doc
        try {
            bufferedReader = new BufferedReader(new FileReader(input));
            String[] t = bufferedReader.readLine().split("\\s+");
            m = Integer.parseInt(t[0]);
            n = Integer.parseInt(t[1]);
            a = new int[m][n];
            b = new int[m][n];
            for (int i = 0; i < m; i++) {
                t = bufferedReader.readLine().split("\\s+");
                for (int j = 0; j < n; j++) {
                    a[i][j] = Integer.parseInt(t[j]);
                }
            }
            for (int i = 0; i < m; i++) {
                t = bufferedReader.readLine().split("\\s+");
                for (int j = 0; j < n; j++) {
                    b[i][j] = Integer.parseInt(t[j]);
                }
            }
            display(a);
            display(b);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ex1.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ex1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bufferedReader.close();
            } catch (IOException ex) {
                Logger.getLogger(ex1.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        // ghi
        
        try {
            printWriter = new PrintWriter(output);
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    printWriter.print(a[i][j] + b[i][j] + "  ");
                }
                printWriter.println();
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ex1.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            printWriter.close();
        }
    }
    
    public static void display(int[][] a) {
        for (int[] is : a) {
            System.out.println(Arrays.toString(is));
        }
    }
}
