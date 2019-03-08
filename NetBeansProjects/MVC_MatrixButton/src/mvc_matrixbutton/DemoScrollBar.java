/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_matrixbutton;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

/**
 *
 * @author lenovo i3
 */
public class DemoScrollBar extends JFrame {

    public DemoScrollBar() {
        this.setTitle("Matrix button");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        JScrollPane scroll = new JScrollPane(textArea);
        this.add(scroll);
        this.setVisible(true);
        
    }
    public static void main(String[] args){
        DemoScrollBar sr = new DemoScrollBar();
    }
}
