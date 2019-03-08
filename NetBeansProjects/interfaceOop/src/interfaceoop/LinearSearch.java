package interfaceoop;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author VanTuPro
 */
public class LinearSearch extends AbstractClass implements Search {

    private ArrayList<String> lName = new ArrayList<>();
    private final String nameSearch;

    public LinearSearch() throws FileNotFoundException {
        lName = AbstractClass.setList1();
        nameSearch = AbstractClass.getName();
    }

    @Override
    
    public Object search() {
        // sort tang dan
       // Collections.sort(lName);
        //
        Collections.sort(lName, new listNameComparateor());
        
        // sort by last name
        ArrayList<String> lastname = new ArrayList<>();
        
        for(String ln : lName){
            for(int i =  ln.length(); i <= 0 ; i--){
                
            }
        }
        
        for (String ln : lName) {
            if (nameSearch.equalsIgnoreCase(ln)) {
                return ln;
            }
            System.out.println(ln);
        }
        return null;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        if (search() != null) {
            System.out.println("YES");
        }
        else{
            System.out.println("No");
        } 
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) throws FileNotFoundException {
        LinearSearch ls = new LinearSearch();
        
        ls.display();
    }

}
