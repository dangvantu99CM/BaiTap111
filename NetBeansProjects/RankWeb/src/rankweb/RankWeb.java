package rankweb;

import java.util.Scanner;

public class RankWeb {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[][] linkC = new int[n][n];
        double[][] p = new double[n][n];
        linkCounts(linkC);
        printLinkCounts(linkC);
        printSumH(sumH(linkC));
        transitionMatrix(linkC, sumH(linkC), p);
        for (int i = 0; i < p.length; i++) {
            for (int j = 0; j < p[0].length; j++) {
                System.out.printf("%.2f\t", p[i][j]);
            }
            System.out.println();
        }
        System.out.println();
//        double[][] Lan1 = new double[1][n];
//        Lan1 = NhanLan1(p);
//
//        for (int j = 0; j < Lan1[0].length; j++) {
//            System.out.printf("%.2f\t", Lan1[0][j]);
//        }
//        System.out.println();
        TinhRank_m_Lan_Chuyen(p, m);
    }

    public static void linkCounts(int[][] linkC) {
        // nhap so cac duong link lien ket den cac trang web khac co trong 1 trang web demn trang web khac
        for (int i = 0; i < linkC.length; i++) {
            for (int j = 0; j < linkC[0].length; j++) {
                linkC[i][j] = sc.nextInt();
            }
        }

    }

    public static int[][] sumH(int[][] linkC) {
        // tinh tong so duong link tren tung trang web
        int[][] sum = new int[linkC.length][1];
        for (int i = 0; i < linkC.length; i++) {
            for (int j = 0; j < linkC[0].length; j++) {
                sum[i][0] += linkC[i][j];
            }
        }
        return sum;
    }

    public static void printLinkCounts(int[][] linkC) {
        // nhap vao ma tran chua so duong link trong tung trang web
        for (int i = 0; i < linkC.length; i++) {
            for (int j = 0; j < linkC[0].length; j++) {
                System.out.print(linkC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void printSumH(int[][] sumC) {
        // in ra tong cac duong link tu trang nay den cac trang khac
        for (int i = 0; i < sumC.length; i++) {
            for (int j = 0; j < sumC[0].length; j++) {
                System.out.print(sumC[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static double[][] transitionMatrix(int[][] linkC, int[][] sumC, double[][] p) {
        // tinh ma tran chuyen
        for (int i = 0; i < linkC.length; i++) {
            for (int j = 0; j < linkC[0].length; j++) {
                p[i][j] = 0.1 * 1 / linkC.length + 0.9 * linkC[i][j] / sumC[i][0];
            }
        }
        return p;
    }

    public static double[][] NhanLan1(double[][] p) {
        double[][] Lan1 = new double[1][p.length];
        int[][] H1 = new int[1][p.length];
        H1[0][0] = 1;
        for (int j = 1; j < p.length; j++) {
            H1[0][j] = 0;
        }
        //for (int i = 0; i < 1; i++) {
        for (int j = 0; j < p[0].length; j++) {
            Lan1[0][j] = 0;
            for (int k = 0; k < p.length; k++) {
                Lan1[0][j] += H1[0][k] * p[k][j];
            }
        }

        // }
        return Lan1;
    }

  /*  public static void TinhRank_m_Lan_Chuyen(double[][] p, int m) {
        double[][] LanM = new double[1][p.length];
        LanM = NhanLan1(p);
        for (int i1 = 0; i1 < p.length; i1++) {
            LanM[0][i1] = NhanLan1(p)[0][i1];
            System.out.printf("%.2f\t", LanM[0][i1]);
        }
        System.out.println("");  
        for (int i = 1; i < m; i++) {
            
            for (int j = 0; j < p.length; j++) {
                double t = LanM[0][j] * p[j][j];
                LanM[0][j] = 0;
                for (int k = 0; k < p.length; k++) {
                    if (k == j) {
                        LanM[0][j] += t + LanM[0][k] * p[k][j];
                    } else {
                        LanM[0][j] += LanM[0][k] * p[k][j];
                    }                  
                }
                System.out.printf("%.2f\t",LanM[0][j]);
            }
        }

        System.out.print("Xac Suat di tu trang 1 den trang thu i sau m lan chuyen trang:  ");
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%.2f\t", LanM[0][i]);
        }
    }
*/
     public static void TinhRank_m_Lan_Chuyen(double[][] p, int m){
       double matrixOutput[][] = new double[1][p.length];
    
       for (int numberMove = 2; numberMove <= m; numberMove++) {
            double matrixOutputBackUp[][] = new double[1][p.length];
            for (int j = 0; j <= p.length - 1; j++) {
                matrixOutputBackUp[0][j] = NhanLan1(p)[0][j];
            }
            for (int i = 0; i <= p.length - 1; i++) {
                matrixOutput[0][i] = 0;
                for (int j = 0; j <= p.length - 1; j++) {
                    matrixOutput[0][i] += p[j][i] * matrixOutputBackUp[0][j];
                }
            }
        }
        for (int i = 0; i < p.length; i++) {
            System.out.printf("%.2f\t", matrixOutput[0][i]);
        }
   }
}
