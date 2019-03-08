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
        public class XoaPhanTu {
            public static void main(String[]args){
                Scanner sc = new Scanner(System.in);
                int n = sc.nextInt();
                int [] A = new int [n];
                for(int i = 0; i < n;i++){
                    A[i] = sc.nextInt();               
                }
                for(int i = 0 ; i < n; i++){
                    if(A[2] == A[i]){
                        for(int j = i; j < n-1; j++){
                            A[j] = A[j+1];
                        }
                        n--;
                    }
                
                }
                for(int i = 0; i < n; i++){
                    System.out.println(A[i]);
                }
            
            }
}
        
