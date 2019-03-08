
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
       // long n = Long.parseLong(args[0]);
        if (kt(n)) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }    
    }
    public static boolean kt(long n) {
        long reset = n;
        long tong = 0;
        long dem = 0;
        while (n > 0) {
            n = n / 10;
            dem++;
        }
        System.out.println(dem);
        n = reset;
        while (n > 0) {
            long r = n % 10;
            int t = 1;
            for(int i = 0; i < dem ; i++){
                t *= r;
            }
            tong = tong + t;
            n = n / 10;
        }
        if (tong == reset) {
            return true;
        }
        return false;
    }
}
