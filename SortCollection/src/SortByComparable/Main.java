/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortByComparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javafx.print.Collation;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        //thêm dữ liệu vào list
        list.add(new Person(1, "a"));
        list.add(new Person(4, "d"));
        list.add(new Person(3, "c"));
        list.add(new Person(2, "b"));
        
        System.out.println("trc khi sx ");
        for (Person p : list) {
            System.out.println(p.getId());
        }
        System.out.println("sau khi sx ");
        Collections.sort(list);
        for (Person person : list) {
            System.out.println(person.getId() + " " + person.getTen());
            
        }
    }
}
