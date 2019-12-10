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
public class Main {
    public static void main(String[] args) {
        System.out.println("Begin"+Thread.currentThread().getName());
        for (int i = 0; i < 4; i++) {
            System.out.println("inside main");
            try{
                Thread.sleep(400);//sleep : dừng lại với thời gian nhất định rồi tự wake up;
            } catch(InterruptedException e){
                System.out.println(e);
            }
            
        }
        ThreadDemo t = new ThreadDemo("Coocking");
        t.start();
        
        System.out.println("Stop Main");
    }
}
