/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList1;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class ArrayListEx2 {
    public static void main(String[] args) {
        //TẠO 1 ARRAYLIST CÓ KIỂU DỮ LIỆU LÀ Student tên là list;
        ArrayList<Student> list = new ArrayList<Student>();
        //tạo các đối tượng có Student;
        Student st1 = new Student(19, "Huy");
        Student st2 = new Student(19, "huyen");
        Student st3 = new Student(19, "huog");
        //thêm vào list đã khai báo ở trên;
        list.add(st1);
        list.add(st2);
        list.add(st3);
        //in ra list
        for (Student x : list) {// x sẽ là biến đếm có kiểu Student và ở đây mình sẽ gọi phương thức toString của đối tg Student để in ra list)
            System.out.println(x.toString());
        }
    }
    
}
