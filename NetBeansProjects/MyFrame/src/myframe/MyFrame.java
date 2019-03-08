package myframe;

import java.awt.BorderLayout;
import java.awt.Frame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author VanTu
 */
public class MyFrame extends JFrame {

    private JButton button1, button2, button3, button4;
    private JTextField textField;
    private JPanel contendPane;

    public MyFrame() {
        this.setSize(400, 400);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contendPane = new JPanel();
        this.setContentPane(contendPane);
        button1 = new JButton("");
        contendPane.add(button1, BorderLayout.PAGE_START);
        button2 = new JButton();
        button3 = new JButton();
        button4 = new JButton();
    }

}
