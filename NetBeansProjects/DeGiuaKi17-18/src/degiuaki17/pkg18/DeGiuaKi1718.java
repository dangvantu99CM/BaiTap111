package degiuaki17.pkg18;
import java.util.Scanner;
public class DeGiuaKi1718 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double x = sc.nextDouble();
        if(x > 1){
            System.out.println("Nhap lai x");
        }
        else{
        double T = 0;
        for(int i = 0; i <= n ; i++)
        {
            T += (Math.pow(-1,i)*Math.pow(x,2*i+1))/(2*i + 1);
        }
        //double x = Math.round((T*100.00)/100.00);
        System.out.printf("%.3f",T);
        // lam tron sau dau thap phan 3 chu so
        sc.close();
    }
    }
}
