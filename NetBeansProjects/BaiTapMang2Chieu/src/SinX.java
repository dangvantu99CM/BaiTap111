import java.util.Scanner;
public class SinX{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
       // System.out.printf("%.2f",tinhS(n,x));
        System.out.printf("%.3f", tinhS(n,x));
        }
    public static double tinhS(int n , double x){
        double sinx = x;
        double p = x;
        for(int i = 1; i <= n ; i++)
        {
            p *= x/(2*i + 1)*x/(2*i);
            if(i % 2 == 0){
                // i chan cong vao
                sinx = sinx + p;
        }
            else{
                // i le tru di
                sinx = sinx - p;
            }
        }
        return sinx;
        
    }
    
}