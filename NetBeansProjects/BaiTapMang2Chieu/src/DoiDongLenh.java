import java.util.Scanner;
public class DoiDongLenh{
    public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int c = sc.nextInt();
    int m = sc.nextInt();
    int n = sc.nextInt();
    int [][] arr1 = new int [m][n];
    for(int i = 0 ; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
            arr1[i][j] = sc.nextInt();
        }
    }
    for(int i = 0; i < m ; i++){
        for(int j = 0 ; j < n ; j++){
            System.out.print(arr1[i][j] + " ");
        }
        System.out.println("");
    }
}
}