import java.util.Scanner;
public class TinhT {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int dem = 0;
        int []A = new int [n];
        for(int i = 0; i < n ; i++){
            A[i] = sc.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            if(A[i] == 0)
            {
                dem++;
                for(int j = i; j < n - dem; j++){
                    A[j] = A[j+1];
                }
                n--;
            }
        }
        for(int i = 0 ; i < n-dem ; i++){
            System.out.print(A[i] + " ");
        }
    }
}
