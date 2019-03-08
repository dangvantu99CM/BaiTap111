package javaapplication18;

import java.util.Scanner;

/**
 *
 * @author DangVanTu
 *
 */
public class JavaApplication18 {

    public static int[] Array(int[] A1, int[] A2) {
        int k1 = A1.length + A2.length;
        int[] A = new int[k1];
        for (int i = 0; i < A1.length; i++) {
            A[i] = A1[i];
        }
        int k = A1.length;
        for (int i = 0; i < A2.length; i++) {
            A[k] = A2[i];
            k++;
        }
        for (int i = 0; i < k1; i++) {
            System.out.print(A[i] + " ");
        }
        System.out.println("");
        for (int j1 = 0; j1 < k1; j1++) {
            for (int i = 0; i < k1 - 1; i++) {
                for (int j = i + 1; j < k1; j++) {
                    if (A[i] == A[j]) {
                        for (int i1 = j; i1 < k1 - 1; i1++) {
                            A[i1] = A[i1 + 1];
                        }
                        k1--;
                    }
                }
            }
        }
        int[] B = new int[k1];
        for (int i = 0; i < k1; i++) {
            B[i] = A[i];
        }
        System.out.println("");
        return B;

    }

    public static void sortArray(int[] A) {

        for (int i = 0; i < A.length - 1; i++) {
            for (int j = i + 1; j < A.length; j++) {
                if (A[i] > A[j]) {
                    int temp = A[i];
                    A[i] = A[j];
                    A[j] = temp;
                }
            }
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int A1[] = new int[n];
        int A2[] = new int[m];
        for (int i = 0; i < n; i++) {
            A1[i] = sc.nextInt();

        }
        for (int i = 0; i < m; i++) {
            A2[i] = sc.nextInt();

        }
        for (int i = 0; i < n; i++) {
            System.out.print(A1[i] + " ");

        }
        System.out.println("");
        for (int i = 0; i < m; i++) {
            System.out.print(A2[i] + " ");

        }
        System.out.println("");
        sortArray(Array(A1, A2));

    }

}
