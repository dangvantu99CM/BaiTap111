/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemtuT4;

/**
 *
 * @author vantu
 */
import java.util.Scanner;

public class MainTest {

	
		
	public static void main(String[] args) {

                SimpleLinkedList<WordCount> wl = new SimpleLinkedList<>();
		Scanner reader = new Scanner(System.in);
		
		String text = reader.nextLine();
		String[] tokens = text.split(" ");
		
		for(int i = 0 ; i < tokens.length ; i++)
		{
			WordCount w = new WordCount(tokens[i]);
			int id = wl.indexOf(w);
			if(id == -1)
			{
				wl.add(w);
			}
			else
			{
				wl.get(id).upCount();
			}
		}
		
		
		for(int i = 0 ; i < wl.size() -1 ; i++)
			for(int j = i+1 ; j < wl.size() ; j++)
			{
				if(wl.get(i).getCount() < wl.get(j).getCount() )
				{
					WordCount wi = wl.get(i).clone();
					WordCount wj = wl.get(j).clone();
					wl.set(i, wj);
					wl.set(j, wi);
				}
			}
		
		for(WordCount w:wl)
		{
			System.out.println(w);
		}
		
		
	}

}

