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
public class Main {
    public static void main(String[] args) {
    List<Person> list = new ArrayList<Person>();
    // sắp xếp các đối tượng phải override lại compareto;
    list.add(new Person(1,"a"));
    list.add(new Person(5,"c"));
    list.add(new Person(3,"d"));
    list.add(new Person(2,"b"));
    
    System.out.println("trc khi sx");
    for (Person person : list) {
        System.out.println(person.getId());
        }
    System.out.println("sau khi sx ");
        Collections.sort(list);
        for (Person p : list) {
            System.out.println(p.getId());
        }
}}
