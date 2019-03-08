/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recusion;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class Fibonacci {

    public static int fibonacci(int n) {
        
        if(n == 0) return 0;
        if(n == 1) return 1;
        return fibonacci(n-1) + fibonacci(n-2);
       
    }
    
    public static double fibona(int n){
        
        
        double number1 = (Math.sqrt(5) + 1) / 2;
        double number2 = (Math.sqrt(5) - 1) / 2;
        
        double bth1 = Math.pow(number1, n);
        double bth2 = Math.pow(number2, n);
        
        double kq = (1/Math.sqrt(5)) * (bth1 - bth2);
        
        return kq;
        
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fibonacci(n));
        System.out.println("===================================================================");
        System.out.println(fibona(n));
    }

}
