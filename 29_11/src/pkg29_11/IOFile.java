/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg29_11;

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
public class IOFile {
   public static void vietFile(List list, String path){
       try {
           ObjectOutputStream o = new ObjectOutputStream(new FileOutputStream(path));
           o.writeObject(list);
           o.close();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
       }
   }
   
   public static List docFile(String path){
       List list = new ArrayList();
       try {
           ObjectInputStream i = new ObjectInputStream(new FileInputStream(path));
           list = (List) i.readObject();
           i.close();
       } catch (FileNotFoundException ex) {
           Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
       } catch (IOException ex) {
           Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
       } catch (ClassNotFoundException ex) {
           Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
       }
       return list;
   }
}
