/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadTrenLop;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class Luong extends Thread{
    String name;

    public Luong(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println("Start" + getName());
        for (int i = 0; i < 5; i++) {
            System.out.println("inside " + getName() + i);
            try {
                sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(Luong.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("End" + getName());
    }
    
    
}
