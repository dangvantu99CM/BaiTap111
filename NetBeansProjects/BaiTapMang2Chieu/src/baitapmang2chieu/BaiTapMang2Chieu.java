package BaiTapMang2Chieu;

import java.util.Scanner;

public class BaiTapMang2Chieu {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] arr1 = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                arr1[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(arr1[i][j] + " ");

            }
            System.out.println(" ");
        }
        if (c == 0) {
            // Nhan 2 ma tran
            int p = sc.nextInt();
            int q = sc.nextInt();
            double[][] arr2 = new double[p][q];
            double[][] arr3 = new double[m][q];
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    arr2[i][j] = sc.nextDouble();
                }
            }
            for (int i = 0; i < p; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(arr2[i][j] + " ");

                }
                System.out.println(" ");
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < q; j++) {
                    arr3[i][j] = 0;
                    for (int k = 0; k < n; k++) {
                        arr3[i][j] += arr1[i][k] * arr2[k][j];
                    }
                }
            }
            for (int i = 0; i < 1; i++) {
                for (int j = 0; j < q; j++) {
                    System.out.print(arr3[i][j] + " ");
                }
                System.out.println();
            }
        
        if (c == -1) {
            // chuyen vi ma tran

            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println(" ");
            }
        }
        // Tim max / min tren 1 hang hoac 1 cot

        if (c == 1) {
            // in max or min tren tung hang hoac tren toan bo ma tran
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = arr1[i][0];
                for (int j = 0; j < n; j++) {
                    if (max < arr1[i][j]) {
                        max = arr1[i][j];
                    }
                }
                System.out.println(max);
            }
            System.out.println(max);
        }
        if (c == 2) {
            // ma tran chuyen vi
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (c == 3) {
            // tim max / min tren 1 hang chi dinh or 1 cot chi dinh
            int k = sc.nextInt();
            int max = 0;
            for (int i = 0; i < m; i++) {
                max = arr1[i][0];
                for (int j = 0; j < n; j++) {
                    if (max < arr1[i][j]) {
                        max = arr1[i][j];
                    }
                }
                if (k == i) {
                    System.out.println(max);
                    break;
                }
            }
        }
        if (c == 4) {
            // tim max / min tren 1 cot chi dinh
            int k = sc.nextInt();
            int max = 0;
            int[][] C = new int[n][m];
            for (int j = 0; j < n; j++) {
                for (int i = 0; i < m; i++) {
                    C[j][i] = arr1[i][j];
                    System.out.print(C[j][i] + " ");
                }
                System.out.println();

            }
            System.out.println();
            for (int i = 0; i < n; i++) {
                max = C[i][0];
                for (int j = 0; j < m; j++) {
                    if (max < C[i][j]) {
                        max = C[i][j];
                    }

                }
                System.out.println(max);
            }
            // for(int i = 0; i < n ; i++) {
            // for(int j = 0; j < m; j++) {
            // System.out.print(C[i][j] + " ");
            // }
            // System.out.println();
            // }
            System.out.println();
            for (int i = 0; i < n; i++) {
                max = C[i][0];
                for (int j = 0; j < m; j++) {
                    if (max < C[i][j]) {
                        max = C[i][j];
                    }
                }
                if (i == k) {
                    System.out.println(max);
                    break;
                }

            }
            // System.out.println(max);

        }
        if (c == 5) {
            if (ktDV(arr1, n, m)) {
                ;
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 6) {
            if (ktDX(arr1, n, m)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 7) {
            if (ktMTC(arr1, m, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 8) {
            if (ktMTTGD(arr1, m, n)) {
                System.out.println(1);

            } else {
                System.out.println(0);
            }
        }
        if (c == 9) {
            if (ktMTTGT(arr1, m, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 10) {
            // doi cho 2 hang cho nhau
            int i1 = sc.nextInt();
            int i2 = sc.nextInt();
            for (int j = 0; j < n; j++) {
                int t = arr1[i1][j];
                arr1[i1][j] = arr1[i2][j];
                arr1[i2][j] = t;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (c == 11) {
            // doi cho 2 cot cho nhau
            int j1 = sc.nextInt();
            int j2 = sc.nextInt();
            for (int i = 0; i < m; i++) {
                int t = arr1[i][j1];
                arr1[i][j1] = arr1[i][j2];
                arr1[i][j2] = t;
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (c == 12) {
            // sap xep 1 hang tang dan hoac giam dan
            int i1 = sc.nextInt();
            for (int j = 0; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (arr1[i1][j] > arr1[i1][k]) {
                        // giam dan > ?? <
                        int t = arr1[i1][j];
                        arr1[i1][j] = arr1[i1][k];
                        arr1[i1][k] = t;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (c == 13) {
            // sap xep tang // giam theo cot
            int j1 = sc.nextInt();
            for (int i = 0; i < m; i++) {
                for (int k = i + 1; k < m; k++) {
                    if (arr1[i][j1] > arr1[k][j1]) {
                        int t = arr1[i][j1];
                        arr1[i][j1] = arr1[k][j1];
                        arr1[k][j1] = t;

                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + "   ");
                }
                System.out.println();
            }
        }
        if (c == 14) {
            int k = sc.nextInt();
            if (ktDTH(arr1, m, n, k)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 15) {
            int k = sc.nextInt();
            if (ktDTC(arr1, m, n, k)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }

        if (c == 16) {
            System.out.println();
            // sap xep cac phan tu cua ma tran tang dan theo hang // cot
            for (int i = 0; i < n * m; i++) {
                for (int j = 0; j < n * m; j++) {
                    if (arr1[i / m][i % m] < arr1[j / m][j % m]) {
                        int t = arr1[i / m][i % m];
                        arr1[i / m][i % m] = arr1[j / m][j % m];
                        arr1[j / m][j % m] = t;
                    }
                }
            }
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(arr1[i][j] + " ");
                }
                System.out.println();
            }
        }
        if (c == 17) {
            MT(arr1, m, n);

        }
        if (c == 18) {
            if (ktMaTranThua(arr1, m, n)) {
                System.out.println("Ma tran thua");
            } else {
                System.out.println("k thua");
            }
        }
        if (c == 19) {
            TimViTriMAX(arr1, m, n);
        }
        if (c == 20) {
            if (kt(arr1, m, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 21) {
            if (ktDayMTDuong(arr1, m, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 22) {
            MTSortTangH(arr1, m, n);
        }
        if (c == 23) {
            MthTongMax(arr1, m, n);
        }
        if (c == 24) {
            MtCTongMax(arr1, m, n);
        }
        if (c == 25) {
            if (ktHToan0(arr1, m, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }

        }
        if (c == 26) {
            if (ktMaTranCotToan0(arr1, m, n)) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
        if (c == 27) {
            TimDiemYenNgua(arr1, m, n);
        }
        if (c == 28) {
            TimCCoSoDuongMax(arr1, m, n);

        }
        if (c == 29) {
            if (ktCSC(arr1, m, n)) {
                System.out.print("Ma tran co hang la CSC");
            } else {
                System.out.println("Khong co hang nao lap thanh CSC");
            }

        }
        if (c == 30) {
            if (ktCCSC(arr1, m, n)) {
                System.out.println("Co cot la csc");
            } else {
                System.out.println("0 co CSC la cot");
            }
        }
        if (c == 31) {
            if (ktCSN(arr1, m, n)) {
                System.out.println("Co hang la CSN");
            } else {
                System.out.println("khong co hang nao la csn");
            }

        }
        if (c == 32) {
            if (kt2HTrung(arr1, m, n)) {
                System.out.println("co 2 hang trung nhau");
            } else {
                System.out.println("k co 2 hang trung");
            }
        }
        sc.close();

    }
    }

    public static boolean ktDV(int[][] A, int n, int m) {
        // kiem tra ma tran don vi la ma tran vuong
        if (m != n) {
            System.out.println("nhap lai m,n");
        }
        for (int i = 0; i < n; i++) {
            if (A[i][i] != 1) {
                return false;
            }
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    j = j + 1;
                    if (A[i][j] != 0) {
                        return false;
                    }
                } else {
                    if (A[i][j] != 0) {
                        return false;
                    }
                }
            }

        }
        return true;
    }

    public static boolean ktDX(int[][] A, int n, int m) {
        // kiem tra ma tran co ddoi xung k
        // mtdx la ma tran vuong ,la ma tran chuyen vi cua ma tran ban dau
        if (m != n) {
            System.out.println("nhap lai m, n");
        }
        int[][] C = new int[n][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                C[i][j] = A[j][i];
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (C[i][j] != A[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // ma tran duong cheo : cac phan tu ngoai duong cheo chinh bang 0
    // ma tran vuong
    // ma tran tam giac tren la ma tran vuong cac phan tu nam duoi duong cheo chinh
    // = 0
    // ma tran tam giac duoi
    public static boolean ktMTC(int[][] A, int m, int n) {
        // kiem tra ma tran cheo
        if (m != n) {
            System.out.println("nhap lai m, n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (i != j) {
                    if (A[i][j] != 0) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public static boolean ktMTTGD(int[][] A, int m, int n) {
        // KIEM TRA MA TRAN TAM GIAC DUOI: cac phan tu nam tren duong cheo chinh = 0
        if (m != n) {
            System.out.println("nhap lai m.n");
        }
        for (int i = 0; i < m; i++) {
            for (int j = i + 1; j <= n - 1; j++) {
                if (A[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean ktMTTGT(int[][] A, int m, int n) {
        // kiem tra ma tran tam giac tren
        // la ma tran cac phan tu nam duoi duong cheo chinh = 0
        if (m != n) {
            System.out.println("nhap lai m,n");
        }
        for (int j = 0; j < n; j++) {
            for (int i = j + 1; i <= n - 1; i++) {
                if (A[i][j] != 0) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean ktDTH(int[][] A, int m, int n, int k) {
        // Kiem tra su tang // giam cua 1 day hang // cot
        for (int j = 0; j < n - 1; j++) {
            if (A[k][j] > A[k][j + 1]) {
                return false;
            }
        }
        return true;

    }

    public static boolean ktDTC(int[][] A, int m, int n, int k) {
        // kiem tra day tang theo cot
        for (int i = 0; i < n - 1; i++) {
            if (A[i][k] > A[i + 1][k]) {
                return false;
            }
        }
        return true;
    }

    public static void MT(int[][] A, int n, int m) {
        // neu phan tu o vi tri nao bang 0 thi cac phan tu o hang va cot do bang 0
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    for (int j1 = 0; j1 < n; j1++) {
                        if (j1 == j) {
                            continue;
                        } else {
                            A[i][j1] = 0;
                        }
                    }
                    for (int i1 = 0; i1 < m; i1++) {
                        if (i1 == i) {
                            continue;
                        } else {
                            A[i1][j] = 0;
                        }
                    }
                }

            }

        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(A[i][j] + " ");

            }
            System.out.println();

        }
//            public static int demSo0(int [][]a, int m, int n){
//                int dem = 0;
//                for(int i = 0; i < m ; i++){
//                    for(int j = 0; j < n; j++){  
//                        if(a[i][j] == 0)
//                        dem += 1;
//                    }
//                    }
//                return dem;
//            }
    }

    public static boolean ktMaTranThua(int[][] A, int m, int n) {
        // kiem tra ma tran thua
        // la ma tran co s0 0 lon hon qua nua tong so cac phan tu ma tran
        int dem = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] == 0) {
                    dem += 1;
                }
            }
        }
        if (dem > (m * n) / 2) {
            return true;
        } else {
            return false;
        }

    }

    public static void TimViTriMAX(int[][] a, int m, int n) {
        // Tim vi tri cac phan tu dat max cua ma tran
//        int csh = 0;
//        int csc = 0;
        int dem = 0;
        int max = a[0][0];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max < a[i][j]) {
                    max = a[i][j];

                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (max == a[i][j]) {
                    dem += 1;
                }
            }
        }

        System.out.println("So cac phan tu max " + dem);
        System.out.print("max " + max);

        for (int i1 = 0; i1 < dem - 1; i1++) {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    if (max == a[i][j] && dem != 1) {
                        System.out.println(" chi so hang " + i + " chi so cot " + j);

                    } else {
                        if (max == a[i][j]) {
                            System.out.println("chi so hang " + i + " chi so cot " + j);
                        }
                    }
                }
            }

        }
    }

    public static boolean kt(int[][] A, int m, int n) {
        // kiem tra trong ma tran co phan tu duong k
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (A[i][j] > 0) {
                    return true;
                }
            }
        }
        return false;

    }

    public static boolean ktDayMTDuong(int[][] a, int m, int n) {
        // kiem tra tat ca ca c phan tu co duong hay k
        int dem = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] > 0) {
                    dem += 1;
                }
            }
        }
        System.out.println(dem);
        if (dem == m * n) {
            return true;
        } else {
            return false;
        }
    }

    public static void MTSortTangH(int[][] a, int m, int n) {
        //Sap xep phan tu cua cac hang tang dan  
        for (int i = 0; i < m * n; i++) {
            for (int j = 0; j < n * m; j++) {
                if (a[i / m][i % m] < a[j / m][j % m]) {
                    int t = a[i / m][i % m];
                    a[i / m][i % m] = a[j / m][j % m];
                    a[j / m][j % m] = t;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void MthTongMax(int[][] a, int m, int n) {
        // tim hang co tong max
        int T = 0;
        int[] A = new int[m];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                T += a[i][j];
                A[i] = T;
            }
            T = 0;
        }

        for (int i = 0; i < m; i++) {
            System.out.print(A[i] + " ");

        }
        System.out.println();
        int max = A[0];
        for (int i = 1; i < m; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println(max);

    }

    public static void MtCTongMax(int[][] a, int m, int n) {
        // tong max tren cot
        int T = 0;

        int A[] = new int[n];
        int max = A[0];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                T += a[i][j];
                A[j] = T;
            }
            T = 0;
            System.out.print(A[j] + " ");
        }
        System.out.println();
        for (int i = 1; i < n; i++) {
            if (max < A[i]) {
                max = A[i];
            }
        }
        System.out.println(max);

    }

    public static boolean ktHToan0(int[][] a, int m, int n) {
        // kiem tra ma tran co hang toan so 0 khong
        int dem = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] == 0) {
                    dem += 1;
                }
            }
            if (dem == n) {
                return true;
            }
            dem = 0;

        }
        return false;

    }

    public static boolean ktMaTranCotToan0(int[][] A, int m, int n) {
        // kiem tra ma tran cot toan so 0?
        int dem = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (A[i][j] == 0) {
                    dem += 1;
                }
            }
            if (dem == m) {
                return true;
            }
            dem = 0;
        }
        return false;
    }

    public static void TimDiemYenNgua(int[][] A, int m, int n) {
        // tim cac diem yen ngua cua ma tran
        // la cac diem min cua hang >> max cua cot
        int a[] = new int[m];
        int b[] = new int[n];
        for (int i = 0; i < m; i++) {
            int min = A[i][0];
            for (int j = 0; j < n; j++) {
                if (min > A[i][j]) {
                    min = A[i][j];
                }
                a[i] = min;
            }
            System.out.println(min);
        }

        for (int j = 0; j < n; j++) {
            int max = A[0][j];
            for (int i = 0; i < m; i++) {
                if (max < A[i][j]) {
                    max = A[i][j];
                }
                b[j] = max;
            }
            System.out.println(max);
        }
        int dem = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i] == b[j]) {
                    dem += 1;
                    System.out.println(A[i][j] + " la diem yen ngua ma tran");

                }
            }
        }
        if (dem == 0) {
            System.out.println(0);
        }
    }

    public static void TimCCoSoDuongMax(int[][] A, int m, int n) {
        // tim cac cot co so duong nhieu nhat
        int[] a = new int[n];
        int dem = 0;
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m; i++) {
                if (A[i][j] > 0) {
                    dem += 1;
                    a[j] = dem;
                }
            }
            dem = 0;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();

        int max = a[0];
        for (int j = 1; j < n; j++) {
            if (max < a[j]) {
                max = a[j];
            }
        }
        for (int j = 0; j < n; j++) {
            if (max == a[j]) {
                if (max == 0) {
                    System.out.print("Khong co so duong");
                    break;
                } else {
                    System.out.println("Row co so duong max la cot thu " + j);
                }
            }
        }

    }

    public static boolean ktCSC(int[][] A, int m, int n) {
        // kiem tra ma tran co hang nao lap thanh CSC k?
        if (n < 3) {
            return false;
        }
        int[] d = new int[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n - 1; j++) {
                if (A[0][j] < A[0][j + 1]) {
                    d[j] = A[0][j + 1] - A[0][j];
                }

            }
        }
        for (int j = 0; j < n - 1; j++) {
            if (d[j] != d[j + 1] || d[j] == 0) {
                return false;
            }
        }
        return true;
    }

    public static boolean ktCCSC(int[][] a, int m, int n) {
        // kiem tra cac cot cua ma tran xem co cot nao lap thanh CSC k
        if (m < 3) {
            return false;
        }
        int[] d = new int[m - 1];
        for (int j = 0; j < n; j++) {
            for (int i = 0; i < m - 1; i++) {
                if (a[i][j] < a[i + 1][j]) {
                    d[i] = a[i + 1][j] - a[i][j];
                }
            }
        }
        for (int i = 0; i < m - 2; i++) {
            if (d[i] == d[i + 1] && d[i] != 0) {
                return true;
            }
        }
        return false;

    }

    public static boolean ktCSN(int[][] A, int m, int n) {
        // kiem tra xem cac hang cua ma tran xem co hang nao lap thanh CSN K
        int[] a = new int[n - 1];
        if (n < 3) {
            return false;
        } else {
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n - 2; j++) {
                    if (A[i][j + 1] * A[i][j + 1] == A[i][j] * A[i][j + 2] && A[i][j] != 0) {
                        for (int j1 = 0; j1 < n - 1; j1++) {
                            if(A[i][j1] != 0){
                                a[j1] = A[i][j1 + 1] / A[i][j1];
                            }
                        }
                    }
                }
            }
            for (int i = 0; i < n - 1; i++) {
                System.out.print(a[i] + " ");
            }

            for (int i = 0; i < n - 2; i++) {
                if (a[i] != a[i + 1] || a[i] == 0 || a[i] == 1) {
                    return false;
                }
            }
            return true;
        }
    }

    public static boolean kt2HTrung(int[][] A, int m, int n) {
        // kiem tra ma tra co 2 hang // cot trung nhau k
        for (int i = 0; i < m - 1; i++) {
            for (int j = 0; j < n; j++) {
                if (A[0][j] == A[m - 1][j]) {
                    return true;
                }
                if (A[i][j] == A[i + 1][j]) {
                    return true;
                }
            }
        }
        return false;
    }

}
