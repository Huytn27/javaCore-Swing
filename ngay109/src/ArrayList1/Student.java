/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList1;

/**
 *
 * @author User
 */
public class Student {
    private int tuoi;
    private String ten;

    public Student(int tuoi, String ten) { //contructor
        this.tuoi = tuoi;
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    @Override
    public String toString(){
        return "Student name = "+ ten + "-" + tuoi;
    }
}
