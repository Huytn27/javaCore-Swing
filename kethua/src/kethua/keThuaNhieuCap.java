/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;

class Animal{
    void eat(){
        System.out.println("eatting.....");
    }}
 class Dog extends Animal{
     void brak(){
         System.out.println("braking.....");
     }}
class BabyDog extends Dog{
    void wreep(){
        System.out.println("wreping.....");
    }
}
public class keThuaNhieuCap {
    public static void main(String[] args) {
      BabyDog b = new BabyDog();
      b.eat();
      b.wreep();
      b.brak();
    }
    
    
    
}
