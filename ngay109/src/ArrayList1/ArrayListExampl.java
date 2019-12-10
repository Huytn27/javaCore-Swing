/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList1;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ArrayListExampl {
    public static void main(String[] args) {
        //tạo 1 arrayList tên là list có kiểu <String>
        ArrayList<String> list = new ArrayList<String>();
        // thêm vào list
        list.add("trần ");
        list.add("ngoc ");
        list.add("huy ");
        // in ra list vừa tạo
        //cách 1:
        for (String x: list) {
            System.out.print(x + " ");
        }
        System.out.println();
        //c2
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
            
        }
 
    }
}
