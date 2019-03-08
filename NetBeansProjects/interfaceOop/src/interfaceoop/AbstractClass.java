
package interfaceoop;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author vantuPro
 */
public abstract class AbstractClass {
    private static ArrayList<String> listName;
    private static String nameSearch;
    static Scanner sc = new Scanner(System.in);
    public static String getName(){
        nameSearch = sc.nextLine();
        return nameSearch;
    }
    public static ArrayList<String> setList(){
        listName = new ArrayList<>();
        
        int n = Integer.parseInt(sc.nextLine());
        for(int i = 0 ; i < n ; i++){
            listName.add(sc.nextLine());
        }
        return listName;
        
    }
    public static ArrayList<String> setList1() throws FileNotFoundException{
        listName = new ArrayList<>();
        Scanner readFile = new Scanner(new File("listName.txt"));
        while(readFile.hasNext()){
            listName.add(readFile.nextLine());
        }
        readFile.close();
        return listName;
    }
    public ArrayList<String> getList(){
        return listName;
    }
    
    public abstract void display1();
    
}
