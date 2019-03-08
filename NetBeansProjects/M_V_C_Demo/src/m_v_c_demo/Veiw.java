/**
 *
 * @author DangVanTu
 */
package m_v_c_demo;

import java.awt.FlowLayout;
import java.awt.Scrollbar;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentListener;
import java.awt.event.TextEvent;
import java.awt.event.TextListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Veiw extends JFrame {

    private JTextField number1;
    private JTextField number2;
    private JTextField number3;
    private JLabel label;
    private JButton button;
    private MessageBox information;
//    private Scrollbar scrollbarHeight;
//    private Scrollbar scrollbarWidth;

    public Veiw() {
        
        this.setTitle("DemoMVC");
        this.setSize(600, 600);
//        scrollbarHeight = new Scrollbar(Scrollbar.HEIGHT,100,1,0,600);
//        scrollbarWidth = new Scrollbar(Scrollbar.WIDTH,100,1,0,600);
//       
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        number1 = new JTextField(10);
        this.add(number1);

        label = new JLabel("+");
        this.add(label);

        number2 = new JTextField(10);
        this.add(number2);
        // number2.addTextListener(new ObjectTextEvent());

        button = new JButton("=");
        this.add(button);
        button.addActionListener(new ObjectEvent());

        number3 = new JTextField(10);
        this.add(number3);

        this.setVisible(true);
    }

    public String getText() {
        return number1.getText();
    }

    public String getTextTwo() {
        return number2.getText();
    }

    public void setTextToNumber3(int t) {
        number3.setText(String.valueOf(t));
    }

    void Error() {
        information = new MessageBox(this, "ThongBao", "Error!--You need enter 2 Integer",300);
    }

    class ObjectEvent implements ActionListener {

        Model m = new Model();

        @Override
        public void actionPerformed(ActionEvent e) {
            try {
                int n1 = Integer.parseInt(getText());
                int n2 = Integer.parseInt(getTextTwo());
                setTextToNumber3(m.sum(n1, n2));
            } catch (NumberFormatException ex) {
                Error();
                displayErrorMessage("You need to enter 2 Integer");

            }

        }

    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
        
    }

}
