/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Animal;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        Cat a = new Cat("Huy");
        Dog b = new Dog("pull");
        
        Zoo z = new Zoo();
        z.add(a);
        z.add(b);
        z.show();
    }
  
}
