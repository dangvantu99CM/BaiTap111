package pagerank;

import java.util.Scanner;

public class PageRank {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập số trang web cần xếp hạng");
        int n = sc.nextInt();
        System.out.println("Nhập số lần chuyển trang liên tiếp");
        int m = sc.nextInt();
        sc.nextLine();
        int matrixDisplay[][] = new int[n][n];
        System.out.println("Nhập ma trận Links Count");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                matrixDisplay[i][j] = sc.nextInt();
            }
        }
        System.out.println("Links Count");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.print(matrixDisplay[i][j] + " ");
            }
            System.out.println("");
        }
        System.out.println("");

        int matrixSaveAllLink[][] = new int[n][1];
        for (int i = 0; i <= n - 1; i++) {
            matrixSaveAllLink[i][0] = 0;
            for (int j = 0; j <= n - 1; j++) {
                matrixSaveAllLink[i][0] += matrixDisplay[i][j];
            }
        }
   
        // tính ma trận matrixtransition
        double p[][] = new double[n][n];
        double xacSuatNhapTrucTiep = 0.1 / n;
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                p[i][j] += xacSuatNhapTrucTiep + 0.9 * matrixDisplay[i][j] / matrixSaveAllLink[i][0];
            }
        }
        System.out.println("Matrix Transition");
        for (int i = 0; i <= n - 1; i++) {
            for (int j = 0; j <= n - 1; j++) {
                System.out.printf("%.2f\t",p[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
        // matrix từ 0 tới i sau lan chuyen dau tien
        double matrixOutput[] = new double[n];
        for (int j = 0; j <= n - 1; j++) {
            matrixOutput[j] = p[0][j];
        }
        // sau m lần move
        for (int numberMove = 2; numberMove <= m; numberMove++) {

            double matrixOutputBackUp[] = new double[n];
            for (int j = 0; j <= n - 1; j++) {
                matrixOutputBackUp[j] = matrixOutput[j];
            }

            for (int i = 0; i <= n - 1; i++) {
                matrixOutput[i] = 0;
                for (int j = 0; j <= n - 1; j++) {
                    matrixOutput[i] += p[j][i] * matrixOutputBackUp[j];
                }
            }

        }
        System.out.println("Xac xuat sau m lan chuyen trang");
        for (int i = 0; i < n; i++) {
            System.out.printf("%.2f\t", matrixOutput[i]);
        }

    }

}
