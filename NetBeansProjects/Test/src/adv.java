/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo i3
 */
public class adv {

   // static int k;

    public static void main(String args[]) {
        int k ;
        int x = 10;
        int c = 3;
        k = x + c;
        System.out.println(k);
        double d = x / (double) c;
        System.out.println(d);
        System.out.println("***********\r#####");
        System.out.println(x < 2 ? "yes" : "no");
        int sum = 0;
      //  for(int number = 2; number <= 100;sum += number,number += 2);
        
        for(int counter =  2 ; counter <= 100; counter++){
            if(counter % 2 == 0)
                sum += counter;
            else
                continue;
        }
        System.out.println(sum);
        
    }
}
