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
public class LuongCach2 implements Runnable{

    @Override
    public void run() {
        System.out.println("Start runnable");
        for (int i = 0; i < 8; i++) {
            System.out.println("inside Runnable " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(LuongCach2.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        System.out.println("End runnable");
    }
    
}
