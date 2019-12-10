/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ngay109;

/**
 *
 * @author User
 */
public class BTQT {
    public void ktMa(String ma ){
        String reg = "^[Bb]{1}\\d{2}[DCNATVM]{4}\\d{3}$";
        if(ma.matches(reg))
            System.out.println("mã đúng ");
        else
            System.out.println("mã sai ");}
    public boolean ktDT(String dt){
        String reg = "^[0]\\d{9}$";
        return dt.matches(reg);
            
    }
}

