/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dequy111.bt;

/**
 *
 * @author vantu
 */
@SuppressWarnings("unchecked")
public class DoiHe10SangNhiPhan {

	// c1 : su dung vong lap

	private static int[] arrBinary;

	public static String toBinary(int n) {
		if (n < 0) {

			return null;

		}
		if (n == 1) {

			return String.valueOf(1);

		}

		arrBinary = new int[n];
		int i = 0;
		while (n > 0) {
			int j = n % 2;
			arrBinary[i] = j;
			n = n / 2;
			i++;
		}
		String result = "";
		String subString = "";
		for (int i1 = arrBinary.length - 1; i1 >= 0; i1--) {
			result += String.valueOf(arrBinary[i1]);
		}
		int s = result.length();
		for (int j = 0; j < s - 1; j++) {
			if (Character.toString(result.charAt(j)).equals(String.valueOf("1"))) {

				subString = result.substring(j, s);
				break;
			}
		}
		return subString;
	}

	// c2 : su dung de quy
	public static String binary(int n) {
//		if(n < 1)
//			return null;
		String result = String.valueOf(n%2);
		if(n == 0) 
			return result;
		return binary(n / 2);
                
	}

	public static void main(String[] args) {
		int n = 5;

//		System.out.println("So " + n + " co dang nhi phan la: " + toBinary(n));
                System.out.println("So " + n + " co dang nhi phan la: " + binary(n));
	}
}
