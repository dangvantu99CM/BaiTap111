
/**
 *
 * @author DangVanTu
 */
package matrixbutton;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class myframe extends JFrame {

    private JButton button1;
    private JButton button2;
    private JPanel contentPane;
    private int[][] numberArray = {{1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}};

    static JButton[][] button = new JButton[5][5];

    public myframe() {

        this.setSize(400, 400);
        this.setTitle("MatrixButton");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(new BorderLayout());

        button = new JButton[5][5];

        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                button[i][j] = new JButton(String.valueOf(numberArray[i][j]));
                contentPane.add(button[i][j]);
                button[i][j].addActionListener(new ObjectEventTwo());
            }
        }
        this.add(contentPane, BorderLayout.CENTER);
        button1 = new JButton("+1");
        button1.addActionListener(new ObjectEvent());
        button2 = new JButton("-1");
        button2.addActionListener(new ObjectEvent());

        this.add(button1, BorderLayout.PAGE_START);

        this.add(button2, BorderLayout.PAGE_END);

        this.setVisible(true);

    }
// xu ly su kien khi nhan vao +1 hoac -1
    class ObjectEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            if (e.getSource() == button1) {
                cungTang();
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        button[i][j].setText(String.valueOf(numberArray[i][j]));
                    }
                }
            } else if (e.getSource() == button2) {
                cungGiam();
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        button[i][j].setText(String.valueOf(numberArray[i][j]));
                    }
                }
            }

        }

    }
// Xu ly su kien khi nhan vao 1 nut trong center

    class ObjectEventTwo implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (e.getSource() == button[i][j]) {
                        int b = Integer.parseInt(button[i][j].getText());
                        b += 1;                       
                        button[i][j].setText(String.valueOf(b));
                    }
                }
            }
        }

    }

    public void cungTang() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numberArray[i][j] += 1;
            }
        }
       
    }

    public void cungGiam() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                numberArray[i][j] -= 1;
            }
        }
        
    }

    public static void main(String[] args) {

        myframe f = new myframe();

    }
}
