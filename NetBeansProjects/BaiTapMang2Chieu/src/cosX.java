import java.util.Scanner;
public class cosX {
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double x = sc.nextDouble();
    System.out.printf("%.3f",tinhc(n,x));
}
    public static double tinhc(int n , double x){
        double cosx = 1 - x*x/2;
        double q = x*x/2;
        for(int i = 1; i <= n ; i++){
            q = q*x*x*1/(2*i+1)*1/(2*i+2);
            if(i % 2 != 0){
                cosx = cosx + q;
            }
            else{
                cosx = cosx - q;
            }
        }
        return cosx;
    }
}

