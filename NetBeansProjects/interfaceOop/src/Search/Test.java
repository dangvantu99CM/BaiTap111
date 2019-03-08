package Search;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vantuPro
 */
public class Test {

    public static void main(String[] args) {

        ArrayList<String> arr = new ArrayList<String>();
        //  System.out.println(arr.length);
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextLine());
        }
        String t;
        for (int i = 0; i < arr.size() - 1; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(i).compareTo(arr.get(j)) > 0) {
                    String t1,t2,t3;
                    t1 = arr.get(i);
                    t2 = arr.get(j);
                    t3 = t1;
                    t1 = t2;
                    t2 = t3;                 
                }
            }
        }

        for (String arrS : arr) {

            System.out.println(arrS);
        }

    }
}
