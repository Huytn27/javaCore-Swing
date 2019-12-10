/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay1110;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class MyString {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name;
        System.out.println("nhập tên : ");
        name = in.nextLine();
        System.out.println("ten ban la : "+ name);
        // 2 cách in mảng
        int []a = {1,2,3,5};
        //cách 1: 
            for (int i = 0; i < a.length; i++) {
                System.out.println(a[i]);}
            System.out.println();
        //cách 2
                for (int j : a) {
                    System.out.println(j);
                }
            System.out.println();
        String[] ds = {"huy","huy2","huy3"};
                for (String d : ds) {
                    System.out.println(d);
                }
        }
    }

