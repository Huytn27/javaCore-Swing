/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package đahình;

/**
 *
 * @author User
 */
public class Empolyee extends Person{
    private double luong;

    public double getLuong() {
        return luong;
    }

    public void setLuong(double luong) {
        this.luong = luong;
    }
    
    @Override
    public void thongtin(){
        System.out.println("class con ");
    }
    
}
