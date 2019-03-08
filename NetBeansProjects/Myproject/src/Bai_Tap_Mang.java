

import java.util.Scanner;

public class Bai_Tap_Mang {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[] A = new int[n];
		for (int i = 0; i < n; i++) {
			A[i] = sc.nextInt();
		}
		for (int i = 0; i < n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
		if (c == 1) {
			int T = 0;
			for (int i = 0; i < n; i++) {
				T += Math.pow(-1, i + 1) * A[i];
			}
			System.out.println(T);
		}
		if (c == 2) {
			if (ktSd(A, n)) {
				System.out.println("Day co so duong.");
			} else {
				System.out.println(0);
			}

		}
		if (c == 3) {
			if (ktDD(A, n)) {
				System.out.println("Day toan so duong.");
			} else {

				System.out.println(0);
			}
		}
                if(c == 4){
                        if(ktSntTRONGD(A,n))
                            System.out.println("Trong day co so nguyen to " );
                        else{
                            System.out.println(0);
                        }

	}
        }
	public static boolean ktSd(int[] A, int n) {
             // kiem tra trong day co so duong k
		for (int i = 0; i < n; i++) {
			if (A[i] > 0)
				return true;
		}
		return false;
	}

	public static boolean ktDD(int[] A, int n) {
            // kiem tra cac phan tu trong day co toan duong k
		for (int i = 0; i < n; i++) {
			if (A[i] <= 0)
				return false;
		}
		return true;
	}
        public static boolean ktSnt(int n){
            if( n < 2 ) return false;
            if( n == 2) return true;
            for(int i = 0; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
        public static boolean ktSntTRONGD(int [] A, int n){
            for(int i = 0 ; i < n ; i++){
                if(ktSnt(A[i]))
                    return true;
            }
                return false;
        
        
        }
            

}
