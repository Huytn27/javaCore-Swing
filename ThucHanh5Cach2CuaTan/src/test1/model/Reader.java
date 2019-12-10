/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test1.model;

import java.io.Serializable;

/**
 *
 * @author minhtanit
 */
public class Reader implements Serializable{
    private int code;
    private String fullName;
    private String address;
    private String phone;

    public Reader() {
    }

    public Reader(int code, String fullName, String address, String phone) {
        this.code = code;
        this.fullName = fullName;
        this.address = address;
        this.phone = phone;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
    
    public Object[] toObjects() {
        return new Object[] {code, fullName, address, phone};
    }
}
