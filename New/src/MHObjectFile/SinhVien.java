/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MHObjectFile;

import java.io.Serializable;

/**
 *
 * @author User
 */
public class SinhVien implements Serializable{
    private String ma, ten;

    public SinhVien(String ma, String ten) {
        this.ma = ma;
        this.ten = ten;
    }
    
    public Object[] toObjects(){
        return new Object[] {ma, ten};
    }
  
}
