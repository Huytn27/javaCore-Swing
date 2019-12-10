
import javax.swing.JFrame;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
public class Hello {
    public HelloSwing(){
        JFrame frame = new JFrame("HEllo");
        frame.setSize(500, 500);
        frame.setVisible(true);
    }
    public static void main(String[] args) {
        new Hello();
    }
}
