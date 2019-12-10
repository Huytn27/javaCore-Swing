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
public class Main {
    public static void main(String[] args){
        AbstractDemo a = new Demo(56);
        a.setName("Hoa Hoa");
        System.out.println(a.getName());
        System.out.println(a.getValue());
        DinhGia d = new Demo();
    }
}
