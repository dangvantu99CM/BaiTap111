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
// c1 :: liet ke nguoc
public class CountNumber {

    /**
     *
     * @param n
     * @deprecated liet ke cac so tu 0 >> n liet ke nguoc bang goi de quy
     */
    public static void countNumber(int n) {
        if (n >= 0) {
            System.out.println(n);
            countNumber(n - 1);
        }

    }

    /**
     *
     * @param int : n
     * @deprecated liet ke cac so tu 0 >> n , liet ke xuoi dong bang de quy
     * DataStruct use : Stack
     */
    public static void countNumber_1(int n) {
        if (n >= 0) {
            countNumber_1(n - 1);
            System.out.println(n);
        }
    }

    /**
     *
     * @param int : n
     * @deprecated liet ke cac so tu 0 >> n , liet ke xuoi dong bang de quy
     */
    
    public static void countNumber_1_2(int n) {
        int i = 0;
        if (i <= n) {
            System.out.println(i);
            countNumber_1_2(i + 1);
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println("------------------------------------------------");
        countNumber(n);
        System.out.println("------------------------------------------------");
        countNumber_1(n);
        System.out.println("------------------------------------------------");
        countNumber_1_2(n);
    }
}
