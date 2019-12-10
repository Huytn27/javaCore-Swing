/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class bien {
    public static float PI = 3.14f; //đây là biến staic
    int n ; // đây là biến instane ( toàn cục )
    public bien(){
        char c = 'c';// đây là biến local (địa phương )

    }
    public void sayHello(){
        int n = 10 ; // cần khởi tạo gtri cho biến local trc;
        System.out.println("gia tri bien local la " + n);
    }
    public static void main(String[] args) {
        bien bienLocal = new bien();
        bienLocal.sayHello();
    }
    }
    
    

