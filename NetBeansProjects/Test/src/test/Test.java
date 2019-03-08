/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;

/**
 *
 * @author lenovo i3
 */
public class Test {

    private PackageManager test;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        Scanner sc = new Scanner(System.in);
//        String s = sc.nextLine();
        //          System.out.println(2001*2002*2003*2004);
//    for(int i = 0 ; i < 20 ; i++){
//        int value = 1 + (int)(Math.random() * 6);
//      //  System.out.println(value);
//    }
//        System.out.println(1 + (int)(Math.random()*6));
//           
//       
        // final double PI = 3.14; // KHAI BAO HANG SO

    }

    public void setObject() {
        test = new PackageManager();
        test.x = 10;
        test.s = "END";
        test.toString();
    }

    class PackageManager {

         int x;
         String s;

        public PackageManager() {
            x = 0;
            s = "Xin chao";
        }
        public String toString(){
            return "x :" + x + "s: " + s;
        }
    }

}
