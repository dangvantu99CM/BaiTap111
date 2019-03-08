import java.util.Scanner;

public class Matrix {
   static Scanner sc = new Scanner(System.in);
   public static void main(String []args){
        int n = sc.nextInt();
        int [][]A = new int [n][n];
        nhapMT(A);
        int c = sc.nextInt();
        for(int i = 0; i < n ; i++){
            for(int j = 0; j < n ; j++){
                System.out.print(A[i][j] + " ");
            }
                System.out.println();
        }
        if( c == 1){
            if(ktMTDV(A))
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
        if(c == 2){
            if(ktCSN(A))
                System.out.println("YES");
            else{
                System.out.println("NO");
            }
        }
        if(c == 3)
        {
            MinC(A);
        }
        if(c==4){
            DoiCC(A);
        }
   }
public static void nhapMT(int [][]A){
    for(int i = 0; i < A.length ; i++){
        for(int j = 0; j < A[0].length; j++){
            A[i][j] = sc.nextInt();

    }
}
}
    public static boolean ktMTDV(int [][]A){
        for(int i = 0; i < A.length ; i++){
            if(A[i][i] != 1) return false;
            for(int j = 0; j < A[0].length ; j++){
                if(i == j){
                    j = j + 1;
                    if (A[i][j] != 0)
                        return false;
                }
                else{
                    if(A[i][j] != 0)
                        return false;
                }
            }
        }
        return true;
    }
    public static boolean ktCSN(int [][]A){
        // kiem tra hang dau tien >> csn
        int [] q = new int [A[0].length - 1];
        if(A[0].length < 3){
            return false;
        }
        for(int j = 0 ; j < A[0].length - 2; j++){
            if( A[0][j] != 0 && A[0][j+1]*A[0][j+1] == A[0][j]*A[0][j+2]){
               for(int j1 = 0 ; j1 < A[0].length - 1; j1++){
                    q[j1] = A[0][j1+1]/A[0][j1];
            } 
            }
        }
        
        for(int i = 0; i < A[0].length - 1; i++){
            System.out.print(q[i] + " ");
        }
        // luu y o day neu ma dieu kien tren k thoa man thi mang q[]
        // neu phan tu nao khong duoc gan gia tri thi tu dong no se 
        // gan gia tri khoi tao la 0
        
        
        for(int j = 0; j < A[0].length - 2; j++){
            
            if(q[j] !=  q[j+1] || q[j] == 0 || q[j] == 1)
                return false;
        }
        return true;
    }
    public static void MinC(int [][]A){
        for(int j = 0 ; j < A[0].length ; j++){
            int min = A[0][j];
            for(int i = 0 ; i < A[0].length ; i++){
                if(min > A[i][j]){
                    min = A[i][j];
                }
            }
            System.out.println(min);
        }
    }
    public static void DoiCC(int [][]A){
        for(int i = 0 ; i < A.length; i++){
            int t = A[i][0];
            A[i][0] = A[i][A[0].length-1];
            A[i][A[0].length-1] = t;
        }
        for(int i = 0; i < A.length; i++){
            for(int j = 0; j < A[0].length ; j++){
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }
    }

}
