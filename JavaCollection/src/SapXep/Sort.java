/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXep;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author User
 */
public class Sort {
    public static void main(String[] args) {
     List<String> list = new ArrayList<>();
        list.add("a");
        list.add("d");
        list.add("c");
        list.add("b");
     //in 
        for (String s: list) {
            System.out.println(s);
        }
    //sap xep tang dan
        Collections.sort(list);
        System.out.println("sau khi sap xep ");
        for (String string : list) {
            System.out.println(string);
        }
    }
    
}
