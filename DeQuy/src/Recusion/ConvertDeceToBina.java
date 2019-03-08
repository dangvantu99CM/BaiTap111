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
public class ConvertDeceToBina {

    public static String cdb(int n) {

        if (n == 0) {
            return String.valueOf(0);
        }
        if (n == 1) {
            return String.valueOf(1);
        }

        return cdb(n/2) + String.valueOf(n%2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(cdb(n));
    }
}
