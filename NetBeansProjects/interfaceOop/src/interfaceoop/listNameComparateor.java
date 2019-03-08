/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceoop;

import java.util.Comparator;

/**
 *
 * @author vantu
 */
// sort giam dan
public final class listNameComparateor implements Comparator<String>{
    
    @Override
    public int compare(String o1, String o2) {
        if(o1.compareTo(o2) == 0){
            
            return 0;
        }
        else if(o1.compareTo(o2) < 0){
           // sort giam dan
            return 1;
        }
        else
           // sort tang dan cho len truoc
            return -1;
    }
    
}
