
package algorithmsort;

import java.util.Scanner;

/**
 *
 * @author vantu
 */
public class FindMax {
    
    public int[] inputArr(){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int []arr = new int[n];
        for(int i = 0 ; i < n ; i++){
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    public void maxValue(){
        int [] arr2 = inputArr();
        int max = arr2[0];
        int index = 0;
        for(int i = 1 ; i < arr2.length ; i++){
            if(max <= arr2[i]){
                max = arr2[i];
                index = i;
            }
        }
        System.out.println("Max value is : " + max + ", index :  " + index);
    }
    public static void main(String[]args){
        FindMax fm = new FindMax();
        fm.maxValue();
    }
}
