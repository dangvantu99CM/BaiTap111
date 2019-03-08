
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author DangVanTu
 */
public class ComplexTest {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        ComplexNumber [] o = new ComplexNumber[2];
        for(int i = 0; i < 2; i++){
            double x = sc.nextDouble();
            double y = sc.nextDouble();
            o[i] = new ComplexNumber(x,y);
        }
        ComplexNumber c = new ComplexNumber();
        c.setReal(c.add(o[0], o[1]).getReal());
        c.setImaginary(c.add(o[0], o[1]).getImaginary());
        System.out.println(c.toString());
        
                
                
                
        
    }
         
}
