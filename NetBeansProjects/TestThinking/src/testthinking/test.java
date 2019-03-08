/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthinking;

import java.util.Scanner;

/**
 *
 * @author lenovo i3
 */
public class test {

    private int[] a;

    public void setMatrixInput() {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        a = new int[n];
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i <= n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] == a[j]) {
                      a[j] = a[j+1];
                }
                n--;
            }
        }
        
        

    }

    public void layso(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 0 && arr[i] > 4) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        test t = new test();
        t.setMatrixInput();
        t.layso(t.a);
    }
}
