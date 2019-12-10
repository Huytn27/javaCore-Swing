/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortByComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        List<Person> list = new ArrayList<Person>();
        list.add(new Person(1, "a"));
        list.add(new Person(3, "c"));
        list.add(new Person(4, "d"));
        list.add(new Person(2, "b"));
        
        System.out.println("trc khi sx ");
        for (Person p : list) {
            System.out.println(p.getId() + p.getTen());
        }
        System.out.println("sau khi sap xep ");
        Collections.sort(list, new Comparator<Person>() { // dùng anonymous class tên là Comparator
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getId() > o2.getId())
                    return 1;
                else if(o1.getId() < o2.getId())
                    return -1;
                return 0;
            }
        });
        for (Person person : list) {
            System.out.println(person.getId());
            
        }
       

       
}
}
