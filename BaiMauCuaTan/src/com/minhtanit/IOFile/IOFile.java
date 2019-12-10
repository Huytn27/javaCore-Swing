/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.minhtanit.IOFile;

import com.minhtanit.QLSV.Student;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author minhtanit
 */
public class IOFile {
    public static void writeFile(List<Student> list, String path) {
        BufferedWriter bw = null;
        try {
            bw = new BufferedWriter(new FileWriter(path));
            for (Student student : list) {
                bw.write(student.getId() + "\n");
                bw.write(student.getName() + "\n");
                bw.write(student.getClasses() + "\n");
                bw.write(student.getGpa() + " \n");         
            }
            System.out.println("Success!");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(bw != null)
                try {
                    bw.close();
            } catch (IOException ex) {
                Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
    public static List<Student> readFile(String path) {
        List<Student> list = new ArrayList<>();
        BufferedReader br = null;
        try {
            br = new BufferedReader(new FileReader(path));
            while(br.ready()) {
                list.add(new Student(Integer.parseInt(br.readLine()), br.readLine(), br.readLine(), Double.parseDouble(br.readLine())));
            }
            System.out.println("Success!");
        } catch(IOException e) {
            e.printStackTrace();
        } finally {
            if(br != null)
                try {
                    br.close();
            } catch (IOException ex) {
                Logger.getLogger(IOFile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return list;
    }
}
