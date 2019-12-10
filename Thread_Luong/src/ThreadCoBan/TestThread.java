/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadCoBan;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class TestThread extends Thread{
    private String threadName;

    public TestThread(String threadName) {
        this.threadName = threadName;
    }
    
    

    public String getThreadName() {
        return threadName;
    }

    public void setThreadName(String threadName) {
        this.threadName = threadName;
    }

    @Override
    public void run() {
        try {
            Thread.sleep(1000); // cho thread ngủ đông
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        for (int i = 0; i < 10; i++) {
            System.out.println(this.getThreadName() + " " + i);
            try {
                Thread.sleep(1000); // cho thread ngủ đông
            } catch (InterruptedException ex) {
                Logger.getLogger(TestThread.class.getName()).log(Level.SEVERE, null, ex);
            
        }
    }}
    
    public static void main(String[] args) {
        TestThread t1 = new TestThread("a");
        TestThread t2 = new TestThread("b");
        t1.start();
        t2.start();
    }
    
}
