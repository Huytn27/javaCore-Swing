/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtanit.IOFile;

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
 * @author minhtanit
 */
public class IOFile2 {
    
    public static <T>void writeFile(List<T> list, String path) {
       
    }  
    
    
    public static <T> List<T> readFile(String f){
        //khi mà đọc dữ liệu từ file vào bảng ta cần cho dữ liệu cần đọc vào 1 ArrayList, 
        // rồi trả về cái ArrayList đó , khi sang bên bảng ta truyền đường dẫn cho phương thức này để nó trả
        // về 1 list dữ liệu rồi ta mới addrow vào bảng;
        List<T> arr = new ArrayList<>();
        try{
            ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
            arr = (List<T>) ois.readObject();
            ois.close();
        }catch(Exception e){
            e.printStackTrace();
        }
        return arr;
    }
}
