package giaithuat.laptrinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author vantu
 */
public class sinhnguanhien_nhiphan {

    // batoan
    // input : doc 1 so nguyen <= 100 tu 1 file
    // output : ghi ra cac so nhi phan duoc sinh ra
    //lap trinh sinh ra theo thu tu tu dien
    private static int n;
    private static int[] a;
//    private Formatter priToFile;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner readFile = new Scanner(new File("input.txt"));
        n = readFile.nextInt();
        readFile.close();
        a = new int[n];
        for (int i = 0; i < n; i++) {

            a[i] = 0;
        }
        System.out.println("Cach sinh ngau nhien 1 : ");
        option_2();
        System.out.println("Cach sinh ngau nhien 2 " );
        output();
    }

    // thuat 1 :  >> idea
    // duyet tu cuoi day ve dau 
    // neu tim thay so 0 dau tien >> 1 >> cac so dang sau 0 >> chuyen het ve 0
    // lap lai qua trinh tren neu tim duoc cau hinh cuoi cung >> 111 
    // voi moi lan lap thi in ngay ra cau hinh cua lan do
    
    
    public static void output() {
        try {
            Formatter priToFile = new Formatter(new File("output.txt"));

            for (int i = 0; i < n; i++) {

                a[i] = 0;
                priToFile.format("%d", a[i]);
                System.out.print(a[i]);

            }
            priToFile.format("%n");
            System.out.println("\n");

            while (true) {
                for (int j = n - 1; j >= 0; j--) {
                    if (a[j] == 0) {
                        a[j] = 1;
                        for (int k = j + 1; k < n; k++) {
                            a[k] = 0;
                        }
                        for (int i1 = 0; i1 < n; i1++) {
                            priToFile.format("%d", a[i1]);
                            System.out.print(a[i1]);
                        }
                        priToFile.format("%n");
                        System.out.println("\n");
                        break;
                    }
                }
                int s = 0;
                for (int h = 0; h < n; h++) {

                    s += a[h];
                }
                if (s == n) {
                    priToFile.close();
                    break;
                }

            }
            
        } catch (FileNotFoundException fNotF) {
            
            fNotF.printStackTrace();
            
        }
        

    }

    public static void option_2() {
        // thuat giai c2 : >>> idea
        // cau hinh ke sau cua cau hinh ke tiep co se bang cau hinh sau bang cau hinh truoc cong them 1 
        // 0 + 1 = 1;
        // duyet cuoi len dau 1 mang >> 0 , 1
        // neu thay 0 >> break vong lap >> 1
        // neu thay 1 >> cover >> 0 
            // tiep tuc lap khong dieu kien voi i-- 
                // thoat ra neu do la 0 >> break >> vong lap
                // lap tiep qua trinh tren neu la 1
        // 1 + 1 = 0 >> nho 1
        try {
            Formatter print = new Formatter(new File("output1.txt"));
            for (int i = 0; i < n; i++) {

                a[i] = 0;
                print.format("%d", a[i]);
                System.out.print(a[i]);

            }
            print.format("%n");
            System.out.println("\n");
            int i = n - 1;
            while (true) {

                if (a[i] == 0) {
                    a[i] = 1;
                    for (int j = 0; j < n; j++) {
                        System.out.print(a[j]);
                        print.format("%d", a[j]);
                    }
                    print.format("%n");
                    System.out.println("\n");

                } else {
                    int j = i;
                    a[i] = 0;
                    while (true) {
                        if (a[j - 1] == 0) {
                            a[j - 1] = 1;
                            for (int j1 = 0; j1 < n; j1++) {
                                
                                System.out.print(a[j1]);
                               
                                print.format("%d", a[j1]);
                                
                            }
                            print.format("%n");
                            System.out.println("\n");
                            break;
                        } else {
                            a[j - 1] = 0;
                            j--;                          
                        }
                    }
                }

                int s = 0;
                for (int j = 0; j < n; j++) {
                    s += a[j];
                }
                if (s == n) {
                    print.close();
                    break;
                }
                
            }
            
        } catch (FileNotFoundException fNotFo) {
            fNotFo.printStackTrace();
        }
    }
}
