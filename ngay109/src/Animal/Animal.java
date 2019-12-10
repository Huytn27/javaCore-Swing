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
    public abstract class Animal {
        String name;

    public Animal(String name) {
        this.name = name;
        
    }
    
    public abstract void sayHello();

    public String getName() {
        return name;
    }
    
    
        
    
  
}
