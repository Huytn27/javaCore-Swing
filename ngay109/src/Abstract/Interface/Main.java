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
public class Main {
    // Person p = new Person(); ko tạo dc so class person là abstract;
    Employee e = new Employee();
    AnimalServiceIml an = new AnimalServiceIml();
    
    AnimalService an2 = new AnimalServiceIml(); //đa hình upcasting;

}
