package degiuaki17.pkg18;
import java.util.Scanner;
public class Exp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double x = sc.nextDouble();
		double t = 1;
		double e = 1;
		for(int i = 1; i <= n; i++) {
			t *= x*Math.pow(i,-1);
			e += t;
		}
                System.out.println(e);
		System.out.printf("%.3f%n",e);// lam tron so den 3 chu so thap phan sau dau phay
                System.out.printf("%-5d%n",10);
                // neu dinh dang %-5d >> dinh dang can le trai bat dau tu so do ra ben phai
                // neu dinh dang %5d >> dinh dang can le phai bat dau tu so do vao ben trai neu thua them khoang troong vao ben trai
                System.out.println(Math.round(e*100.00)/100.00);
		sc.close();

	}

}
