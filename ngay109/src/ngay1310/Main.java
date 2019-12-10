/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1310;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        int[] mang = new int[5];
        
        NhanVien[] nhanviens = new NhanVien[3];
        
        Scanner in = new Scanner(System.in);
        System.out.println("vui lòng nhập vào giá trị");
        for (int i = 0; i < nhanviens.length; i++) {
            String ten = in.nextLine();
            String diachi = in.nextLine();
            int tuoi = in.nextInt();
             
            nhanviens[i] = new NhanVien(ten, diachi, tuoi);
            
            //xóa bộ nhớ đệm;
            in.nextLine();
            
        }
        for (int i = 0; i < nhanviens.length; i++) {
            System.out.println("thong tin nhan vien "+(i+1)+":"+ nhanviens[i].getTen()+" "+nhanviens[i].getTuoi()+" "+nhanviens[i].getDiaChi());
            
        }
            
        }
    }
   
            
    

