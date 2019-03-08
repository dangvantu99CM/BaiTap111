package interfaceoop;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author vantuPro
 */
public class SearchBinary extends AbstractClass implements Search {

    private ArrayList<String> lName = new ArrayList<>();
    private String nameSearch;

    public SearchBinary() throws FileNotFoundException {

        lName = AbstractClass.setList1();
        nameSearch = AbstractClass.getName();

    }

    @Override
    public Object search() {
        // sort tang dan
        System.out.println(nameSearch + " " + lName.size());
        
        Collections.sort(lName, new listNameComparateor());
        for (String ln : lName) {
            System.out.println(ln);
        }
        // sort giam dan

        int size = lName.size() - 1;
        int low = 0;
        
        while (low <= size) {
            int middle = (size + low) / 2;

            if (nameSearch.equalsIgnoreCase(lName.get(middle))) {
                return lName.get(middle);
            } else if (nameSearch.compareTo(lName.get(middle)) > 0) {
                size = middle - 1;
            } else {
                low = middle + 1;
            }

        }

        return null;
    }

    public static void main(String[] args) throws FileNotFoundException {
        SearchBinary seaB = new SearchBinary();

        seaB.display();

    }

    @Override
    public void display1() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void display() {
        if (search() != null) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
//To change body of generated methods, choose Tools | Templates.
    }

}
