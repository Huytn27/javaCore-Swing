/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MHObjectFile;

import com.sun.corba.se.impl.io.IIOPOutputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author User
 */
public class IOFIle {
    //viết data từ bảng ra file , cần biết viết cái gì và viết vào đâu
    // => cần List và path;
    public static <T> void vietFile(List<T> list, String path){
        try {
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(path));
            oos.writeObject(list);
            oos.close();
        } catch (IOException ex) {
            Logger.getLogger(IOFIle.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    // đọc dữ liệu từ file vào bảng , ta cần path,
    // đọc hết dữ liệu trong file ra 1 cái arrayList => hàm này sẽ return về arrayList , rồi bên kia sẽ add vào = phương thức addRow
    public static <T> List<T> docFile(String path){
        List<T> arr = new ArrayList<>();
        try {
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(path));
            arr = (List<T>) ois.readObject();
            ois.close();
        } catch (Exception ex) {
            Logger.getLogger(IOFIle.class.getName()).log(Level.SEVERE, null, ex);
        }
        return arr;
    }
}
  
