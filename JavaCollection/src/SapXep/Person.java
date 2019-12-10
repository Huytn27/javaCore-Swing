/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SapXep;

/**
 *
 * @author User
 */
public class Person implements Comparable<Person>{
   private int id; 
   private String ten;

    public Person(int id, String ten) {
        this.id = id;
        this.ten = ten;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

//    @Override
//    public int compareTo(Person o) {
//        // đây là sắp xếp tăng dần muốn giảm dần thì đổi 1 thành -1 và -1 thành 1
//        if(this.id > o.id)
//            return 1;
//        if(this.id < o.id)
//            return -1;
//        else 
//            return 0;
//    }
//    
//    //sắp xếp theo tên 
    @Override
    public int compareTo(Person o) {
        return this.getTen().compareTo(o.getTen());
    }
   
   
}
