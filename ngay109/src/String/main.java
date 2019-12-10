/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package String;

/**
 *
 * @author User
 */
public class main {
    public static void main(String[] args) {
        Animal a = new Animal();
        Wolf b = new Wolf();
        Animal c = (Wolf) b;
        a.say();
        b.say();
        c.say();
    }
 
}
