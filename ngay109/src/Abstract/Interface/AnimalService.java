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
public interface AnimalService { //chỉ gồm các pthuc abstract
    public abstract void them();
    
    public void sua(); // trong interface mọi thứ sẽ ngầm đinh là public abstract; ko có private .......vv
    void xoa();
    
}
