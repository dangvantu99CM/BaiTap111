
package huscalculator;

import static java.awt.SystemColor.scrollbar;
import javax.swing.JFrame;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class JScrollBarDemo {
    public static void main(String[] args){
        
        JFrame f = new JFrame();
        f.setTitle("LOVE");
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea textArea = new JTextArea();
        JScrollBar scrollbar = new JScrollBar();
        scrollbar.setBounds(200, 200, 50, 400);
        textArea.add(scrollbar);
        f.add(textArea);
        
        
        f.setVisible(true);
    }
        
}
