package algorithmsort;

import java.util.Scanner;

/**
 *
 * @author vantu
 */
public class SelectSort {

    public int[] inputArr() {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        return arr;
    }

    public void swap(int[] a, int i, int j) {

        int temp = a[i];
        a[i] = a[j];
        temp = a[j];

    }

    public void test() {

    }

    public void sortArr() {
        int[] arr2 = inputArr();

        for (int i = 0; i < arr2.length - 1; i++) {
            int min_index = i;
//            int min = arr2[i];
            for (int j = i + 1; j < arr2.length; j++) {

                if (arr2[j] < arr2[min_index]) {

//                    min = arr2[j];
                    min_index = j;

                }

            }
            swap(arr2, i, min_index);

        }
        System.out.println("Mang sau khi sap xep theo kieu sap xep chon: ");
        for (int i = 0; i < arr2.length; i++) {
            System.out.print(arr2[i] + ",");
        }
    }

    public static void main(String[] args) {
        SelectSort seSort = new SelectSort();
        seSort.sortArr();
    }

}
