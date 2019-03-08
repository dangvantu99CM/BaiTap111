/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc_go;

/**
 *
 * @author lenovo i3
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;

public class Veiw extends JFrame {

    private JButton button;
    private JTextField text1;
    private JTextField text2;
    private JTextField text3;
    private JLabel label;
//    private JScrollBar scrollbarHeight;
//    private JScrollBar scrollbarWidth;
    
    public Veiw() {
        this.setSize(400, 400);
//        scrollbarHeight = new JScrollBar(JScrollBar.VERTICAL,100,10,0,400);
//        scrollbarWidth = new JScrollBar(JScrollBar.HORIZONTAL, 100, 10,0 ,400);
//        scrollbarHeight.setBounds(0,400,20,400);
//        scrollbarWidth.setBounds(400,0,400,20);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());
        this.setTitle("Caculate");
        text1 = new JTextField(5);
        this.add(text1);       
        label = new JLabel("+");
        this.add(label);
        text2 = new JTextField(5);
        this.add(text2);
        button = new JButton("=");
//        this.add(scrollbarHeight);
//        this.add(scrollbarWidth);
        this.add(button);
        
        text3 = new JTextField(5);
        this.add(text3);
        this.setVisible(true);
    }
    public int getFirstNumber(){
        return Integer.parseInt(text1.getText());
    }
    public int getNumberTwo(){
        return Integer.parseInt(text2.getText());
    }
    public void setCalculate(String s){
        text3.setText(s);
    }
    public JTextField getCalculate(){
        return text3;
    }
    void messengeToUser(String messengeER){
        JOptionPane.showMessageDialog(this, messengeER);
    }
    void ObjectEvent(ActionListener oEvent){
        button.addActionListener(oEvent);
    }
//    void ObjectEvent01(AdjustmentListener EventScroll){
//        scrollbarHeight.addAdjustmentListener(EventScroll);
//        scrollbarWidth.addAdjustmentListener(EventScroll);
//    }
    
    
    
}
