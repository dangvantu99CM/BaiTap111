import java.util.Scanner;
public class inRnSoNT {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n  = sc.nextInt();
        int dem = 0 ;
        int x = 2;
        while(dem < n){
            if(kt(x)){
                System.out.println(x);  
                dem++;
            }
            x++;          
    }    
    }
    public static boolean kt(int n ){
        if(n < 2) return false;
        if(n == 2) return true;
        for(int i = 2; i < n ; i++){
            if(n % i == 0)
                return false;
        }
        return true;
    }
}
