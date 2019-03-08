package Tong_Hop_BaiTapMang1Chieu;
import java.util.Scanner;
public class Tong_Hop_BaiTapMang1Chieu {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int c = sc.nextInt();
		int n = sc.nextInt();
		int[] A = new int[n];
                double [] a = new double[n];
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
				T += Math.pow(-1, i) * A[i];
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
                if(c == 5){
                         if(demSnt(A,n) == n){
                             System.out.println("Day toan so nguyen to.");
                         }
                         else{
                         
                             System.out.println("0");
                         }
                }
                if(c == 6){
                        if(KtDayTang(A,n))
                            System.out.println("Day Tang.");
                        else{
                            System.out.println("0");
                        }
                }
//                if(c == 7){
//                        for(int i = 0 ; i < n ; i++){
//                            a[i] = sc.nextInt();
//                
//                        }
////                        if(KtDayDanDau(a,n))
////                            System.out.println("Day Dan Dau.");
////                        else{
////                            System.out.println("0");
////                        }
////                
////                }
//        
//        }
        if(c == 7){
                double x =  sc.nextDouble();
                for(int i = 0 ; i < n; i++){
                    a[i] = sc.nextDouble();
                
                }
                for(int i = 0 ; i < n ;i++){
                    if(x == a[i]){
                        System.out.println(a[i]);
                        break;
                    }
                    else{
                        //Them phan tu vao mang
                        
                    }
                }
                sortD(a,n);
        
        }
        if(c == 8){
           TBC(NhapMang(n),n);
        }
        if(c == 9){
            TimMax(NhapMang(n),n);
        }
        if(c == 10){
            TimMax2(NhapMang(n),n);
        
        }
        if(c == 11){
            MaxAM(NhapMang(n),n);
        }
        }
	public static boolean ktSd(int[] A, int n) {
             // kiem tra trong day co so duong k c2
		for (int i = 0; i < n; i++) {
			if (A[i] > 0)
				return true;
		}
		return false;
	}

	public static boolean ktDD(int[] A, int n) {
            // kiem tra cac phan tu trong day co toan duong k c3
		for (int i = 0; i < n; i++) {
			if (A[i] <= 0)
				return false;
		}
		return true;
	}
        public static boolean ktSnt(int n){
            // kiem tra so nguyen to
            if( n < 2 ) return false;
            if( n == 2) return true;
            for(int i = 2; i < n; i++){
                if(n % i == 0){
                    return false;
                }
            }
            return true;
        }
        public static boolean ktSntTRONGD(int [] A, int n){
            // kiem tra trong day co so nguyen ro k c4
            for(int i = 0 ; i < n ; i++){
                if(ktSnt(A[i]))
                    return true;
            }
                return false;
        
        
        }
        public static int demSnt(int []A, int n){
            
            // Dem cac so nguyen to trong day c5
            int dem  = 0;
            for(int i = 0; i < n ;i++){
                if(ktSnt(A[i]))
                    dem += 1;
            }
            return dem;
        }
        public static boolean KtDayTang(int [] A, int n){
            // kiem tra day tang c6
            for(int i = 0 ; i < n + 1 ;i++){
                if(A[i] > A[i+1])
                    return false;
            }
            return true;
        }           

//        public static boolean KtDayDanDau(double [] A, int n){
//            // kiem tra day dan dau
//            for(int i = 0 ; i < n ; i++){
//               
//                
//            
//            }
//            
//        }
//            
        public static void sortD(double []a, int n){
            // sap xep giam dan c7
            for(int i = 0; i < n ;i++){
                for(int j = i + 1; j < n ; j++){
                    if(a[i] < a[j]){
                        double t = a[i];
                        a[i] = a[j];
                        a[j] = t;
                    
                    }
                }
            
            }
            for(int i = 0 ; i < n ;i++){
                System.out.print(a[i]+ " ");
            
            }
        }
        public static void TBC(double [] A, int n){
            // trung bin cong so am c8
                double tong = 0;
                int dem  = 0;
                for(int i = 0 ; i < n ; i++){
                       if(A[i] < 0)
                           dem += 1;
                           tong += A[i];
                           
                }
                double tbc = tong/dem;
                System.out.println(tbc);
        }
        public static double[] NhapMang(int n){
            // Nhap maang tu ban phim
            Scanner sc = new Scanner(System.in);
            double []a = new double[n];
            for(int i = 0 ; i < n ;i++){
                a[i] = sc.nextDouble(); 
            }
            return a;
        }
        public static void TimMax(double []a, int n){
            // tim max va chi so c9
            double max = a[0];
            for(int i = 1 ; i < n; i++){
                if(max < a[i])
                    max = a[i];
                
            }
            for(int i = 0 ; i < n ;i++){
                if(max == a[i]){
                    System.out.println(max + " Chi so la " + i);
                }
            
            }
        }
        public static void TimMax2(double []a, int n){
            // tim phan tu lon thu 2 trong day c10
            double max = a[0];
      
            for(int i = 1; i < n ; i++){
                if(max < a[i])
                    max = a[i];
            }
            // Xoa phan tu trong mang
            for(int i = 0; i < n ; i++){
                if(max == a[i]){
                    for(int j = i; j < n-1; j++){
                        a[j] = a[j+1];
                    }
                    n--;
                } 
           
            }
             for(int i = 0; i < n ; i++){
                System.out.print(a[i] + " ");
             }
             System.out.println();
            double max1 = a[0];
            for(int i = 0; i < n ; i++){
                if(max1 < a[i])
                    max1 = a[i];
                    
            }
            System.out.println("Phan tu lon thu 2 : " + max1);
           
        }
//        public static void MaxAM(double []a, int n){
//            // tim phan tu am lon nhat trong day
//            for(int i = 0; i < n ;i++){
//                if(a[i] >= 0){
//                    for(int j = i; j < n-1; j++){
//                        a[j] = a[j+1];
//                    }
//                    n--;
//                } 
//               
//            }
//            for(int i = 0; i < n ;i++){
//                System.out.print(a[i] + " ");
//            }
//        }
        public static void MaxAM(double []a, int n){
            int dem = 0;
            for(int i = 0; i < n ;i++){
                if(a[i] < 0 ){
                    dem += 1;
                }
            }
            System.out.println(dem);
            
            double [] a1 = new double [dem];
            for(int i = 0; i < n ;i++){
                   if(a[i] < 0){
                       for(int j = 0 ; j < dem ; j++){
                           a1[j] = a[i];
                             
                }
                       
            }
            }
           
               for(int i = 0; i < dem ; i++){
                   System.out.print(a1[i]+ " ");
               }
               System.out.println();
            double max = a1[0];
            for(int i = 0; i < dem ; i++){
                if(max < a1[i]){
                    max = a1[i];
                }
            }
            System.out.println(max);
        
        }
}
