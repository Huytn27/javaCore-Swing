/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Equal;

/**
 *
 * @author User
 */
public class Person {
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

    @Override
    public boolean equals(Object obj) { //obj là đối số truyền vào 
        if(obj instanceof Person){
            Person p2 = (Person)obj; //ép kiểu obj sang person;
            if(p2.getId() == this.id) 
                return true;
            return false;
        }
        else
            return false;
        
    }
    
   
    
}
