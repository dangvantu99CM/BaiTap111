package Search;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vantuPro
 */
public class SortByNameTest {

    public static void main(String[] args) throws FileNotFoundException {
        
        ArrayList<String> hoten = new ArrayList<>();
        try (Scanner readFile = new Scanner(new File("listName.txt"))) {
            while (readFile.hasNext()) {
                hoten.add(readFile.nextLine());
            }

            for (String ln : hoten) {
                System.out.println(ln);
                String[] name = ln.split(" ", 0);
                for (int j = name.length - 1; j >= 0; j--) {
                    System.out.println(name[j]);
                }
                
            }
        }
        sinhngsunhien();
    }

    public static void sinhngsunhien() {
        int n = 1 + (int) (Math.random() * 100);
        System.out.println(n);
    }
}
