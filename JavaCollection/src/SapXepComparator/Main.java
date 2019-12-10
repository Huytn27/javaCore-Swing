/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXepComparator;

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
        
        list.add(new Person("a", 1));
        list.add(new Person("c", 4));
        list.add(new Person("b", 6));
        list.add(new Person("e", 7));
        list.add(new Person("d", 5));
        
        System.out.println("trc khi sx");
        for (Person person : list) {
            System.out.println(person.getName() + person.getTuoi());
            
        }
        System.out.println("sau khi sx");
        //sd comparator 
        Collections.sort(list , new Comparator<Person>(){
            @Override
            public int compare(Person o1, Person o2) {
                if(o1.getTuoi() > o2.getTuoi())
                    return 1;
                if(o1.getTuoi() < o2.getTuoi())
                    return -1;
                return 0;
            }
            
        });
        for (Person person : list) {
            System.out.println(person.getTuoi());
        }
        
    
}}
