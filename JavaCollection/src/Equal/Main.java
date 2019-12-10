/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equal;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        
    Person p1 = new Person(1, "A");
    Person p2 = new Person(1, "A");
    System.out.println(p1 == p2); //false do so sánh địa chỉ bộ nhớ 
    System.out.println(p1.equals(p2)); //false muốn true phải override lại hàm equal 
    
     }
}
