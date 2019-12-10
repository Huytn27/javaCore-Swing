/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thread_luong;

/**
 *
 * @author User
 */
public class RunnableDemo implements Runnable{
    private int index = 0;
    @Override
    public void run() {
        System.out.println("start Runnable");
        for (int i = 0; i < 10; i++) {
            System.out.println("inside Runnable" + index++);
            
        }
    }
    
}
