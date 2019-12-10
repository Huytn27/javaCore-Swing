/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtanit.QLSV;

/**
 *
 * @author minhtanit
 */
public class Student {
    private int id;
    private String name;
    private String classes;
    private double gpa;

    public Student() {
    }

    public Student(int id, String name, String classes, double gpa) {
        this.id = id;
        this.name = name;
        this.classes = classes;
        this.gpa = gpa;
    }
    
    public Object[] toObject() {
        return new Object[] {id, name, classes, gpa};
    }
    
    public Object[] toObject2() {
        return new Object[] {id, name, gpa};
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClasses() {
        return classes;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    
    
}
