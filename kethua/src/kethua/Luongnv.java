/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kethua;





/**
 *
 * @author User
 */
class Nhanvien{
    float luong = 1000;
}
class Dev extends Nhanvien { // Dev là lớp con kế thừa từ lớp cha Nhanvien
    int bonus = 200;
}
public class Luongnv {
   public static void main(String agrs[]){
       Dev a = new Dev();
       System.out.println("luong dev la: "+ a.luong);
       System.out.println("bonus la : "+a.bonus);
   }}

               
              
               
   