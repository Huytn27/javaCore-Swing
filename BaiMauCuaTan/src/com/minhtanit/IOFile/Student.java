/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtanit.IOFile;

import java.io.Serializable;

/**
 *
 * @author minhtanit
 */
public class Student implements Serializable{
    private String code, name;

    public Student() {
    }

    public Student(String code, String name) {
        this.code = code;
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public Object[] toObjects() {
        return new Object[]{code, name};
    }
    
}
