
import java.util.Scanner;

public class Lan_1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] linkC = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                linkC[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(linkC[i][j] + " ");
              //  System.out.print(linkC[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        int[][] linkC_1 = new int[1][n];
        for (int j = 0; j < n; j++) {
            linkC_1[0][j] = linkC[0][j];
            System.out.print(linkC_1[0][j] + " ");
        }
        System.out.println();
        double [][] p = new double[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                p[i][j] = sc.nextDouble();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(p[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        double [][] lan1 = new double[1][n];
        for(int i = 0 ; i < 1; i++){
            for(int j = 0 ; j < n; j++){
                lan1[i][j]= 0;
                for(int k = 0; k < n; k++){
                    lan1[i][j] += linkC_1[i][k] * p[k][j];
                }
            }
        }
        for(int i = 0; i < n; i++){
            System.out.print(lan1[0][i] + " ");
        }

    }
}
