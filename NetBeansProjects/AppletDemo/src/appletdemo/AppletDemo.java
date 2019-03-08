package appletdemo;

import java.applet.Applet;
import java.awt.event.ActionEvent;
import java.awt.event.*;
import java.awt.*;

/**
 *
 * @author DangVanTu
 */
public class AppletDemo extends Applet implements ActionListener {

    Label promtpt1;
    TextField input1;
    Label promtpt2;
    TextField input2;
    int number1, number2;

    public void init() {
        promtpt1 = new Label("Enter an integer");
        add(promtpt1);
        input1 = new TextField(10);
        add(input1);
        promtpt2 = new Label("Enter an integer and press Enter");
        add(promtpt2);
        input2 = new TextField(10);
        input2.addActionListener(this);
        add(input2);

    }
    public void paint(Graphics g){
        g.drawString("The comparision results are: ",70,75);
        if(number1 == number2)
            g.drawString(number1 + "==" + number2, 100,95);
        if(number1 != number2)
            g.drawString(number1 + "!=" + number2,100, 125);
        if(number1 < number2)
            g.drawString(number1 + "<" + number2,100,150);
        if(number1 > number2)
            g.drawString(number1 + ">" + number2, 100, 175);
        if(number1 <= number2)
            g.drawString(number1 + "<=" + number2,100, 200);
        g.drawString(number1 + " >= " + number2,100, 220);
    }
    public void actionPerformed(ActionEvent e){
        number1 = Integer.parseInt(input1.getText());
        number2 = Integer.parseInt(input2.getText());
        repaint();
    }
}
