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
public class AnimalServiceIml implements AnimalService{// để kế thừa từ 1 interface ,class con cần có từ khóa implements và
                                                        // cần có các method từ class cha bằng cách ghi đè
    @Override
    public void them() {
        System.out.println("them"); 
    }

    @Override
    public void sua() {
        
    }

    @Override
    public void xoa() {
        
    }
                                                        
}
