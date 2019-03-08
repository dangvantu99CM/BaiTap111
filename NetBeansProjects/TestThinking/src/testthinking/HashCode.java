/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testthinking;

/**
 *
 * @author lenovo i3
 */
public class HashCode {
    public static void main(String[]args){
        String s1 = "hello",s2="hello";
        System.out.println(s1.hashCode() + " " + s2.hashCode());
        // searh ki tu trong 1 van ban 
        // indexOOf(int) or lastIndexOf(int)
        
        System.out.println("s1 ghep s2 : " + s1.concat(s2));
        
        char[] charArray = s1.toCharArray();
        System.out.println(s1.replace("h", "H"));
        System.out.println(s1);
        
        
    }
    
}
