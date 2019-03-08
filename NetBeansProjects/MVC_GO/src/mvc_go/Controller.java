package mvc_go;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.AdjustmentEvent;
import java.awt.event.AdjustmentListener;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo i3
 */
public class Controller {

    private Model m;
    private Veiw v;

    public Controller(Model m, Veiw v) {
        this.m = m;
        this.v = v;
        this.v.ObjectEvent(new ObjectEvent());
      //  this.v.ObjectEvent01(new ObjectEvent01());
        
    }
    class ObjectEvent implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            try{
               m.setSum(v.getFirstNumber(), v.getNumberTwo()); 
               v.getCalculate().setText(String.valueOf(m.getSum()));
               v.setCalculate(String.valueOf(m.getSum()));
            }
            catch(NumberFormatException ne){
                v.messengeToUser("You need Enter 2 Integer");
            }
        }
        
    }
    class ObjectEvent01 implements AdjustmentListener{

        @Override
        public void adjustmentValueChanged(AdjustmentEvent e) {
            
        }
        
    }

}
