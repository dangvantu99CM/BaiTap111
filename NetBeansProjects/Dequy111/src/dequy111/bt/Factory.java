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


public class Factory {

	public static long factory(int n) { 
		if(n <= 1) {
			return 1;
		}
		return n*factory(n-1);
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(factory(3));

	}

}
