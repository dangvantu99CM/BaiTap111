package mvc_matrixbutton;

import java.awt.*;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Veiw extends JFrame {

    private JButton button1;
    private JButton button2;
    private JPanel contentPane;
    private int[][] matrix = {{1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}, {1, 0, 1, 2, 3}};
    private JButton[][] button;

    public Veiw() {

        this.setTitle("Matrix button");
        this.setSize(400, 400);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        button1 = new JButton("+1");
        button2 = new JButton("-1");
        button = new JButton[5][5];
        this.setLayout(new BorderLayout());
        this.add(button1, BorderLayout.PAGE_START);
        this.add(button2, BorderLayout.PAGE_END);
        contentPane = new JPanel();
        contentPane.setLayout(new GridLayout(5, 5));
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                button[i][j] = new JButton(String.valueOf(matrix[i][j]));
                contentPane.add(button[i][j]);

            }
        }
        this.add(contentPane, BorderLayout.CENTER);
        this.setVisible(true);
    }

    void ObjectEvent(ActionListener al) {
        button1.addActionListener(al);
        button2.addActionListener(al);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                button[i][j].addActionListener(al);
            }
        }
    }

    public void setMatricButton(JButton[][] buttonNew) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                button[i][j] = buttonNew[i][j];
            }
        }
    }

    public JButton[][] getMatrixButton() {
        return button;
    }

    public void setMatrix(int[][] mt) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matrix[i][j] = mt[i][j];

            }

        }
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public JButton getButton1() {
        return button1;
    }

    public JButton getButton2() {
        return button2;
    }

}
