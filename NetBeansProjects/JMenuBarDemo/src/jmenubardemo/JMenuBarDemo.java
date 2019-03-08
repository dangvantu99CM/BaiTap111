
package jmenubardemo;

import java.awt.BorderLayout;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JTextArea;

public class JMenuBarDemo {

    public static void main(String[] args) {
        String [] fonts = {"TimesRoman","Courier","Heivetica"};
        String[] colors = {"red","blue","Pink"};
        JFrame f = new JFrame();
        f.setLayout(new BorderLayout());
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JTextArea t = new JTextArea();
        JMenu m = new JMenu("Format");
        JMenu font = new JMenu("Fonts");
        JMenu color = new JMenu("Colors");
        JMenuItem [] fontA = new JMenuItem[fonts.length];
        for(int i = 0; i < fonts.length; i++){
            fontA[i] = new JMenuItem(fonts[i]);
            font.add(fontA[i]);
        }
        JMenuItem [] cA = new JMenuItem[colors.length];
        for(int i = 0 ; i < colors.length ; i++){
            cA[i] = new JMenuItem(colors[i]);
            color.add(cA[i]);
        }
        m.add(font);
        m.add(color);
        JMenuBar mb = new JMenuBar();
        mb.add(m);       
        f.add(mb,BorderLayout.PAGE_START);
        f.setVisible(true);
        
    }
    
}
