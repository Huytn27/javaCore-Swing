/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay279;

/**
 *
 * @author User
 */
public abstract class AbstractDemo {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public abstract int getValue();
    public abstract void write();
    
}
