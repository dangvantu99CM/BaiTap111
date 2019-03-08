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
public class Factory {
    public static int factory(int n){
        if(n <= 1) return 1;
        return n*factory(n -1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(factory(n));
    }
}
