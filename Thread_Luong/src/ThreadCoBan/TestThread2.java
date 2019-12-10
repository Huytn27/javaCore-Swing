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
public class TestThread2 extends Thread{

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                Logger.getLogger(TestThread2.class.getName()).log(Level.SEVERE, null, ex);
            }
            System.out.println(this.getName()+ " " + i );
        }
    }
    
    public static void main(String[] args) {
        TestThread2 t1 = new TestThread2();
        t1.setName("Thread 1");
        
        TestThread2 t2 = new TestThread2();
        t2.setName("Thread 2");
        
        TestThread2 t3 = new TestThread2();
        t3.setName("Thread 3");
        
        t1.start();
        try {
            t1.join(); // cho thread 1 chạy xong thì thread 2 - 3 mới chạy cùng nhau
//            t1.join(1500); // cho thread 2 3 dừng trong 1500 milis , để thread 1 chạy , rồi 3 thread lại chyaj cùng nhau
        } catch (InterruptedException ex) {
            Logger.getLogger(TestThread2.class.getName()).log(Level.SEVERE, null, ex);
        }
        t2.start();
        t3.start();
    }
    
}
