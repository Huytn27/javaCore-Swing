/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;
import javax.swing.Locale;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

public class main extends JFrame {
    JLabel lb1,lb2,lb3,lb4;
    JTextField tx1,tx2,tx3;
    JButton bt1,br2;
    
    public main() {
        setTitle("Demo the first");
        setSize(400,300);
        setLocation(200,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lb1 = new JLabel("Nhap a : ");
        lb2 = new JLabel("Nhap b : ");
        lb3 = new JLabel("Nhap c : ");
        lb4 = new JLabel("Ket qua : ");
        txt1 = new JTextField();
        txt2 = new JTextField();
        bt1 = new JButton();
        
        
    }
    
}
