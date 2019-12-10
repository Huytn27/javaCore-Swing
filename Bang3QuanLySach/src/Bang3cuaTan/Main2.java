/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author minhtanit
 */
public class Main2 {
    public static void main(String[] args) {
        Map<String, Integer> map = new TreeMap<>();
        
        String[] a = {"a", "b" , "a", "c", "c " , "C"};
        for (int i = 0; i < a.length; i++) {
            if (!map.containsKey(a[i])) {
                map.put(a[i], 1);
            } else {
                map.replace(a[i], map.get(a[i]) + 1);
            }
        }
        for (String s : map.keySet()) {
            System.out.println(s + ": " + map.get(s));
        }
    }
}
