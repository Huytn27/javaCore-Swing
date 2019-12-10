/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

import java.text.Normalizer;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
    Person p1 = new Person(1);
    Person p2 = new Person(2);
    Person p3 = new Person(3);
    
    //khai báo list
    List<Person> listPerson = new ArrayList<Person>(); //list la class interface cha nen can khai bao den class con la arraylist => da hinh
    listPerson.add(p1);// vi tri 0
    listPerson.add(p2);// vi tri 1
    listPerson.add(p3);// vi tri 2
    
    Person p = listPerson.get(0); // p = là vị trí 0 trong list
    System.out.println(p.getId());
    
    for (Person person : listPerson) {
            System.out.println(person.getId());
        }
        for (int i = 0; i < listPerson.size(); i++) {
            System.out.println(listPerson.get(i).getId());;
            
        }
    //xoa phan tu
    
    listPerson.remove(0);
    listPerson.remove(p1);
 }
    
    
    
}
