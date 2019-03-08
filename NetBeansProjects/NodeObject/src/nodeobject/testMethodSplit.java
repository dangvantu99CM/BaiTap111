/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeobject;

import java.util.Scanner;

/**
 *
 * @author lenovo i3
 */
public class testMethodSplit {

    public static void main(String[] args) {
//        SimpleLinkedList<WordCount> wl = new SimpleLinkedList<WordCount>();
        Scanner reader = new Scanner(System.in);

        String text = reader.nextLine();
        String[] tokens = text.split(" ");
        for (String w1 : tokens) {
            System.out.println(w1);
        }
    }
}
