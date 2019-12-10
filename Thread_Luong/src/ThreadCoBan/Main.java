/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThreadCoBan;

/**
 *
 * @author User
 */
public class Main {
    public static void main(String[] args) {
        MyThread1 my1 = new MyThread1();
        Thread t = new Thread(my1);
        
        //đối với cách khai báo thứ 2 của Mythread2 chỉ cần tạo 1 đối tg mới
        MyThread2 my2 = new MyThread2();
        // ta có 2 luồng chạy song song với nhau
        t.start();
        my2.start();
    }
}
