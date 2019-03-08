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
public class DoubleFactory {
    public static int doubFactory(int n){
        if(n == 1) return 1;
        if(n == 2) return 2;
        return n*doubFactory(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(doubFactory(n));
    }
}
