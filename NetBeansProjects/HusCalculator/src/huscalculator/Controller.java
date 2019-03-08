
/**
 *
 * @author DangVanTu
 */
package huscalculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller {
    private MyFrameCalculator veiw;
    private ModelCalcullator model;
    public Controller(MyFrameCalculator veiw,ModelCalcullator model){
        this.veiw = veiw;
        this.model = model;
        veiw.ObjectEventButton(new ObjectEventButtons());
        
    }
    class ObjectEventButtons implements ActionListener{
        String[]s;
        @Override
        public void actionPerformed(ActionEvent e) {
           for(int i = 1; i < 5; i++){
               for(int j = 0; j < 4; j++){
                   if(veiw.getInputArr()[i][j].getIcon() == veiw.getInputArr()[i][j]){
                       veiw.setText(veiw.getInputArr()[i][j].getText());
                   }
               }
           }
           s = new String[veiw.getText().length()];
           for(int j = 0; j < 4; j++){
               if(veiw.getInputArr()[0][j].getIcon() == veiw.getInputArr()[0][0]){
                   veiw.setText("");
               }
               else if(veiw.getInputArr()[0][j].getIcon() == veiw.getInputArr()[0][1]){
                   for(int j1 = 0; j1 < 4; j1++ ){
                       
                   }
               }
           }
        }
        
    }
    
}
