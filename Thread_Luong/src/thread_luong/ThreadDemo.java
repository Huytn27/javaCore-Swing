/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_luong;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class ThreadDemo extends Thread{
    private int index;
    public ThreadDemo(String name){
        super(name);
    }
    
    public void run(){
        System.out.println("Start " + getName());
        for (int i = 0; i < 10; i++) {
            
                System.out.println("inside "+getName()+":"+(index++));
            try {    
                sleep(500);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            
        }
    }
}
