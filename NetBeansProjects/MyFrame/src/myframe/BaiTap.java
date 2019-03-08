package myframe;

import java.awt.BorderLayout;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import java.awt.Menu;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javafx.scene.control.MenuBar;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author Van Tu
 */
public class BaiTap {

    public static void main(String[] args) {
        MyFrame myFrame = new MyFrame();
        myFrame.setTitle("HUS NOTEPAD");

        JMenuBar menubar = new JMenuBar();
        JMenu file = new JMenu("File");
        JMenu help = new JMenu("Help");
        JMenuItem newfile = new JMenuItem("New");
        JMenuItem exitfile = new JMenuItem("Exit");
        JMenuItem abouthelp = new JMenuItem("About");
        help.add(abouthelp);
        file.add(newfile);
        file.add(exitfile);
        menubar.add(file);
        menubar.add(help);
        myFrame.setJMenuBar(menubar);

        JTextArea textarea = new JTextArea();
        JScrollPane scrollpane = new JScrollPane(textarea);
        myFrame.add(scrollpane);

        newfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                textarea.setText("");
            }
        });

        exitfile.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                //To change body of generated methods, choose Tools | Templates.
                System.exit(0);
            }
        });

        JPanel contendPane = new JPanel();
        myFrame.setContentPane(contendPane);
        contendPane.setLayout(new GridLayout(1,4));

        
        JTabbedPane tP = new JTabbedPane();
        JPanel google = new JPanel();
        JButton button1 = new JButton("Google");
        contendPane.add(button1);
        google.add(button1);
        tP.add(google);
        JPanel Bing = new JPanel();
        JButton button2 = new JButton("Bing");
        contendPane.add(button2);
        Bing.add(button2);
        tP.add(Bing);
        JPanel hus = new JPanel();
        JButton button3 = new JButton("Hus");
        contendPane.add(button3);
        hus.add(button3);
        tP.add(hus);
        JPanel mim = new JPanel();
        JButton button4 = new JButton("MIM");
        contendPane.add(button4);
        tP.add(mim);
        

        myFrame.setVisible(true);

    }
}
