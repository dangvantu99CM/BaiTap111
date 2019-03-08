/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo i3
 */
import java.util.Scanner;
public class SoDoiXung {
    public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    if(kt(n))
        System.out.println(1);
    else{
        System.out.println(0);
    }
    }
    public static boolean kt(long n){
        long T = 0;
        long reset = n;
        while(n > 0){
            long r =  n % 10;
            T = T*10 + r;
            n = n / 10;
        }     
        if(T == reset){
            return true;
    }
        return false;
}
}
