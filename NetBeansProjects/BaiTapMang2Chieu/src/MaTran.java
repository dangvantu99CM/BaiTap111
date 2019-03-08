import java.util.Scanner;
public class MaTran {
    static Scanner sc = new Scanner(System.in);
    public static int[][] nhapMT(int [][] A, int m, int n){
        for(int i = 0; i < m ; i ++){
            for(int j = 0; j < n ; j++){
                A[i][j] = sc.nextInt();        
            }
            }
        return A;
    
    }
    public static int[][] CongMT(int [][]a, int [][]b, int m, int n){
        int C [][] = new int [m][n];   
        for(int i = 0; i < m ;i++){
                for(int j = 0; j < n ; j++){               
                C[i][j] =  a[i][j] + b[i][j];
                }
            }
        return C;
    
    }
    public static void print(int [][]a, int [][]b, int m, int n){
        int [][]C = new int [m][n];
        C = CongMT(nhapMT(a,m,n),nhapMT(b,m,n),m,n);
        for(int i = 0; i < m ;i++){
            for(int j = 0; j < n ; j++){
                System.out.print(C[i][j] + " ");
        }
        System.out.println();
    }
    }
    public static void main(String[] args){
        int m = sc.nextInt();
        int n = sc.nextInt();      
        int [][] A = new int [m][n];        
        int [][]B = new int [m][n]; 
        print(A,B,m,n);
       
    }
}


