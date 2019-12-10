/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Abstract.Interface;

/**
 *
 * @author User
 */
// public class EmployeeImpl implements EmployeeService{ // dùng implements để kế thừa từ interface EmployeeService
public class EmployeeImpl implements EmployeeService,AnimalService{ //cũng có thể kế thừa nhiều interface thong qua dấu phẩy
    @Override
    public void luong() {
       //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void them() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void sua() {
        ; //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void xoa() {
       ; //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        
    }
}
