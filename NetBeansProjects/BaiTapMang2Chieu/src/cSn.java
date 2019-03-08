import java.util.Scanner;
public class cSn {
    public static boolean kt(int []A){
        int []p = new int [A.length - 1];
        for(int i = 0; i < A.length - 1; i++){
            if(A[i] == 0 ) return false;
            else{
                
                    p[i] = A[i+1]/A[i];
            }
            }
        
        for(int i = 0; i < p.length - 1; i++){
            if(p[i] != p[i+1] || p[i] == 1)
                return false;
        }
        return true;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int []A = new int[n];
        for(int i =0; i < n; i++){
            A[i] = sc.nextInt();
        }
        if(kt(A)){
            System.out.println("true");
        }
        else{
            System.out.println("false");
        }
    }
}
