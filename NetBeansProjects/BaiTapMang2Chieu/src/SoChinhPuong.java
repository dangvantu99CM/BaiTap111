
import java.util.Scanner;
import sun.security.tools.keytool.Main;
public class SoChinhPuong {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double k = Math.sqrt(n);
        if((int)k < k || n == 0){
            System.out.println(n + " k la so chinh phuong");           
        }
        else{
            System.out.println(n + " la so chinh phuong");
        }
    }
}
