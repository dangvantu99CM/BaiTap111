package mvc_matrixbutton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author lenovo i3
 */
public class Controller {

    private Veiw v;
    private Model m;

    public Controller(Veiw v, Model m) {
        this.v = v;
        this.m = m;
        v.ObjectEvent(new ObjectEvent());
    }

    class ObjectEvent implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            //To change body of generated methods, choose Tools | Templates.
            for (int i = 0; i < 5; i++) {
                for (int j = 0; j < 5; j++) {
                    if (e.getSource() == v.getMatrixButton()[i][j]) {
                        int b = Integer.parseInt(v.getMatrixButton()[i][j].getText());
                        b += 1;
                        v.getMatrixButton()[i][j].setText(String.valueOf(b));
                    }
                }
            }
            if (e.getSource() == v.getButton1()) {
                m.setMatrix(v.getMatrix());
                m.cungtang();
                //v.setMatrix(m.getMatrix());
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                       // v.getMatrixButton()[i][j].setText(String.valueOf(v.getMatrix()[i][j]));
                         v.getMatrixButton()[i][j].setText(String.valueOf(m.getMatrix()[i][j]));
                    }
                }

            } else if (e.getSource() == v.getButton2()) {
                m.setMatrix(v.getMatrix());
                m.cunggiam();
                //v.setMatrix(m.getMatrix());
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < 5; j++) {
                        v.getMatrixButton()[i][j].setText(String.valueOf(m.getMatrix()[i][j]));
                    }
                }

            }
            

        }
    }

}
