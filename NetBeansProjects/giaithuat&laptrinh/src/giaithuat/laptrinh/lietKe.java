package giaithuat.laptrinh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/**
 *
 * @author DangVanTu
 */
// bai toan to hop 
// n = {1,2,3,...,n}
// input : int n <= 100 >> doc tu file
// output  : >> ghi ra file cac so duoc sinh ngau nhien >> theo thu tu tu dien
// cac phan tu khong dc lap lai
// To hop chap k cua n
public class lietKe {

    // thuat toan 
    // + Di tu cuoi len dau neu 
    // gap 1 phan tu chua dat den gioi han tren >> tang phan tu do len 1
    // va giam cac phan tu phia sau ve ghan duoi cua no
    // vi cac phan tu phia sau da dat toi ghan tren
    // ghan tren x[i] = n - k + i
    // ghan duoi >> x[i] = x[i-1] + 1
    // lap nhu vay khi ma khong tim dc phan tu thoa man b2
    private int[] a;
    private int[] arr;

    public void readFile(String fileName) {
        try {

            Scanner readFile = new Scanner(new File(fileName));
            int n, k;
            n = readFile.nextInt();
            k = readFile.nextInt();
            a = new int[n];
            arr = new int[k];

            for (int j = 0; j < arr.length; j++) {
                arr[j] = j + 1;
                System.out.print(arr[j]);
            }
            System.out.println("");
            for (int i = 0; i < a.length; i++) {
                a[i] = i + 1;
            }
            readFile.close();

        } catch (FileNotFoundException notFile) {
            notFile.printStackTrace();
        }
    }

    public void printToFile(String fileName) {
        int count = 1;
        try {
            Formatter print = new Formatter(new File(fileName));
            for(int i = 0; i < arr.length ; i++){
                print.format("%d", arr[i]);
            }
            print.format("%n");
            while (true) {
                for (int i = arr.length - 1; i >= 0; i--) {

                    if (arr[i] < (a.length - arr.length + i + 1)) {
                        arr[i] = arr[i] + 1;
                        if (i < arr.length - 1) {
                            for (int j = i + 1; j < arr.length; j++) {
                                arr[j] = arr[j - 1] + 1;
                            }
                        }
                        for (int k = 0; k < arr.length; k++) {
                            System.out.print(arr[k]);
                        }
                        System.out.println("");
                        for (int i1 = 0; i1 < arr.length; i1++) {
                            print.format("%d", arr[i1]);
                        }
                        print.format("%n");
                        count++;
                        break;
                    }
                }
                for(int j = 0; j < arr.length ; j++){
                    if(arr[j] == a.length - arr.length + 1 + j)   
                        print.close();
                        break;
                }
               
            }
            
            
            
        } catch (FileNotFoundException notFile) {
            notFile.printStackTrace();
        }
    }

    public static void main(String[] args) {
        lietKe lk = new lietKe();
        lk.readFile("vao.txt");
        lk.printToFile("ra.txt");
    }
}
