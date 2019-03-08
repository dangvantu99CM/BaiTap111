package Recusion;

import java.util.Scanner;

/**
 *
 * @author Henry
 */
//Sinh viên hoàn thành phương thức countPath(int M, int N, int t)
public class Robot {

    public static int countPath(int M, int N, int t) {

        if (t == 1) {
            return 1;
        } else if (t == N) {
            return 1;
        } else if (t == M) {
            return 1;
        }

        return countPath(M, N - 1, t) + countPath(M, N + 1, t + 1) + countPath(M + 1, N, t) + countPath(M + 1, N, t + 1);

    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int t = sc.nextInt();
        System.out.println(countPath(m, n, t));

    }

}
