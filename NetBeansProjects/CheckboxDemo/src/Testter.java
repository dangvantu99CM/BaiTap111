
import checkboxdemo.CheckboxDemo;
import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.event.ItemEvent;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo i3
 */
public class Testter  {
    public static void main(String[]args){
        
        CheckboxDemo c = new CheckboxDemo();
        c.init();
        c.start();
        Frame frame = new Frame("Ung dung doc lap");
        frame.add(c,BorderLayout.CENTER);
       // frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setVisible(true);
        
    }
}
