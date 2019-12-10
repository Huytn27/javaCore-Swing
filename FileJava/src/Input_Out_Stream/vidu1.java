/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Input_Out_Stream;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

/**
 *
 * @author User
 */
public class vidu1 {
    public static void main(String[] args) throws IOException {
        //tạo 1 file tên là "test.txt"
        File file = new File("C:\\Users\\User\\Documents\\NetBeansProjects\\FileJava\\src\\Input_Out_Stream\\test.txt");
        //exists kiểm tra xem file tồn tại hay chưa
        //createNewFile kiểm tra xem file tồn tại hay chưa
        if(!file.exists()){
            file.createNewFile();
        }
        
        //đọc dữ liệu từ file ta khởi tạo 1 biến fileInput thuộc kiểu FileInputStream
        //FileInputStream , FileOutputStream dùng để đọc ghi file text , nhị phân
        
        FileInputStream fileInput = new FileInputStream(file);
        
        // giống Scanner khi khai báo để đọc dữ liệu từ bàn phím 
//        Scanner sc = new Scanner(System.in);
//        int a = sc.nextInt();
        
        // fileInput sẽ quét nội dung của file vào bộ nhớ 
        // sẽ dùng read sẽ đọc kí tự đầu tiên trong file và dùng vòng lặp 
        int c = fileInput.read(); // mỗi kí tự trong file sẽ có 1 mã int , ta read() ra rồi gán vào 1 biến c kiểu int
        
        while(c != -1){ // đọc đến khi nào = -1 nghĩa là đến cuối file thì dừng
            System.out.print((char)c); // ép kiểu sang int sang char rồi in ra màn hình
            c = fileInput.read(); // sau khi đọc xong kí tự thứ nhất thì lại đọc đến kí tự thứ 2 và gán vào c
    
}
        fileInput.close();
        
    FileOutputStream fileOutput = new FileOutputStream(file);
    String s = "helloo 222222222";
    // ghi đè dữ liệu vô file;
    fileOutput.write(s.getBytes());
    }}
    

