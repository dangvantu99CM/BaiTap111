package matrixbutton;

import javax.swing.JButton;

/**
 *
 * @author DangVanTu
 */
public class MatrixButton {

    private JButton[][] buttonArray;
    public MatrixButton(){
    }
    public void setButtonArray(int [][] numberArr){
        
        for(int i = 0; i < numberArr.length; i++){
            for(int j = 0; j < numberArr[0].length; j++){
                buttonArray[i][j] = new JButton(String.valueOf(numberArr[i][j]));
            }
        }
    }
    public JButton[][] getButtonArray(){
        return buttonArray;
    }
    

   
}
