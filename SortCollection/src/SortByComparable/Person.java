/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SortByComparable;

/**
 *
 * @author User
 */
public class Person implements Comparable<Person>{ //sắp xếp kiểu comparable
    private int id ;
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

    @Override
    public int compareTo(Person o) {
//        // sắp xếp id tăng dần , đổi 1 thành -1 nếu muốn giảm dần
//        if(this.id > o.id)
//            return 1;
//        else if(this.id < o.id)
//            return -1;
//        return 0;
    return this.ten.compareTo(o.ten); //sx tăn dân theo tên , giảm dần thêm - trc this
    }
    
    
}
