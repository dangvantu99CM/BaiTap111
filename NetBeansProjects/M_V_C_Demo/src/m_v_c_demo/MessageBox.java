
package m_v_c_demo;

import java.awt.Dialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author lenovo i3
 */
public class MessageBox extends Dialog implements ActionListener {
    private JLabel message;
    
    private JButton ok;
    public MessageBox(JFrame parent,String title,String messageString, int Width){
        super(parent,title,true);
        setSize(Width,300);
        setResizable(false);
        message = new JLabel(messageString);
        add(message,BorderLayout.CENTER);
        ok = new JButton("OK");
        add(ok,BorderLayout.PAGE_END);
        ok.addActionListener(this);
        setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
         //To change body of generated methods, choose Tools | Templates.
         setVisible(false);
    }
    
}
