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
public class Dog extends Animal{
    public Dog(String name){
        super(name);
        this.name = name;
    }
    
    @Override
    public void sayHello(){
        System.out.println("said "+super.getName());
    }
    
}
