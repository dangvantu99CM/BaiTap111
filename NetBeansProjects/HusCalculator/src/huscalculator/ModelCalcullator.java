/**
 *
 * @author CMZEU
 *
 */
package huscalculator;

public class ModelCalcullator {

    private double sum;
    private double multyply;
    private double div;
    private double tru;
    
    public void setSum(double firstNumber, double secondNumber){
        sum = firstNumber + secondNumber;
    }
    public double getSum(){
        return sum;
    }
    public void setMultyply(double firstNumber, double secondNumber){
        multyply = firstNumber*secondNumber;
    }
    public double getMultyply(){
        return multyply;
    }
    public void setDiv(double firstNumber, double secondNumber){
        div = firstNumber / secondNumber;
    }
    public double getDiv(){
        return div;
    }
    public void setTru(double firstNumber, double secondNumber){
        tru = firstNumber - secondNumber;
    }
    
}
