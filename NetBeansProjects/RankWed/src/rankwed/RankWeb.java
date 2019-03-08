package rankwed;
import java.util.Scanner;

public class RankWeb {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int m=sc.nextInt();		
		sc.nextLine();
		int matrixDisplay[][]=new int[n][n];
		for (int i=0;i<=n-1;i++) {
			for (int j=0;j<=n-1;j++) {
				matrixDisplay[i][j]=sc.nextInt();
			}
		}
		
		//matrix save all link
		int matrixSaveAllLink[]=new int[n];
		for (int i=0;i<=n-1;i++) {
			matrixSaveAllLink[i]=0;
			for (int j=0;j<=n-1;j++) {
				matrixSaveAllLink[i]+=matrixDisplay[i][j];
			}
		}
		
		// tính matrix one move 
		double matrixOneMove[][]=new double[n][n];
		double xacSuatNhapTrucTiep=0.1/n;
		for (int i=0;i<=n-1;i++) {
			for (int j=0;j<=n-1;j++) {
				matrixOneMove[i][j]+=xacSuatNhapTrucTiep+0.9*matrixDisplay[i][j]/matrixSaveAllLink[i];
			}
		}
		// matrix từ 0 tới i sau k move
		double matrixOutput[]=new double[n];
		for (int j=0;j<=n-1;j++) {
			matrixOutput[j]=matrixOneMove[0][j];
		}
		
		// sau m lần move
		for (int numberMove=2;numberMove<=m;numberMove++) {
			//backup
			double matrixOutputBackUp[]=new double[n];
			for (int j=0;j<=n-1;j++) {
				matrixOutputBackUp[j]=matrixOutput[j];
			}
			//
			for (int i=0;i<=n-1;i++) {
				matrixOutput[i]=0;
				for (int j=0;j<=n-1;j++) {
					matrixOutput[i]+=matrixOneMove[j][i]*matrixOutputBackUp[j];
				}
			}
                        
		}
                for(int i = 0; i < n ; i++){
                            System.out.printf("%.2f\t",matrixOutput[i]);
                        }
		//in kết quả
		//System.out.println("xác suất để truy cập từ trang thứ 0 sang trang thứ "+ii+" trong "+m +" lần move là: "+matrixOutput[ii]);
		
	}

}
