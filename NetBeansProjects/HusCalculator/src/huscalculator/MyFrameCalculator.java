/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author CMZAU
 */
package huscalculator;
import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrameCalculator extends JFrame {
    private JButton[][] button;
    private JTextField text ;
    private String[][] input = {{"cls","Bck","null","close"},{"7","8","9","/"},{"4","5","6","*"},{"1","2","3","-"},{"0",".","=","+"}};
    public MyFrameCalculator(){
        button = new JButton[5][4];
        JButton b = new JButton();
        
        this.setTitle("HUSCalculator");
        this.setSize(300,300);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);;
        this.setLayout(new BorderLayout());
        JPanel contentPane1 = new JPanel();
        contentPane1.setLayout(new GridLayout(5,4));
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                button[i][j] = new JButton(input[i][j]);
                
                contentPane1.add(button[i][j]);
            }
        }
        button[0][2].setVisible(false);
        text = new JTextField(300);    
        this.add(text,BorderLayout.PAGE_START);
        this.add(contentPane1,BorderLayout.CENTER);
        this.setVisible(true);
        
    }
    public JButton[][] getInputArr(){
        return button;
    }
    public void setText(String t){
        text.setText(t);
    }
    public String getText(){
        return text.getText();
    }
    void ObjectEventButton(ActionListener event){
        for(int i = 0; i < 5; i++){
            for(int j = 0; j < 4; j++){
                button[i][j].addActionListener(event);
            }
        }
    }
}
