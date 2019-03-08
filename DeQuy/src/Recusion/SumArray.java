package Recusion;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
public class SumArray {

    public static double sumArr(double[] a, int n) {

        if (n < 0) {
            return 0;
        }

        return sumArr(a, n - 1) + a[n - 1];

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(sumArr(a, n));

    }
}
