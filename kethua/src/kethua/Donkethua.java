/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;


class animal{
    void eat(){
        System.out.println("eatting.....");
    }}
 class dog extends animal{
     void brak(){
         System.out.println("braking.....");
     }}
public class Donkethua {
    public static void main(String[] args) {
        dog a = new dog();
        a.eat();
        a.brak();
    }}
        
  
