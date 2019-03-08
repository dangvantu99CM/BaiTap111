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
import java.util.Iterator;
@SuppressWarnings({"unchecked", "deprecation"})
public class SimpleLinkedList<T> implements ListInterface<T> {
	class Node {
		T data;
		Node next;
	}
	private Node top = null;
	private Node bot = null;
	private int n = 0;
	
	@Override
	public void add(T data) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public T get(int i) {
		// TODO Auto-generated method stub
	
		return null;
	}
	@Override
	public void set(int i, T data) {
		// TODO Auto-generated method stub
	
	}
	@Override
	public void remove(int i) {
		// TODO Auto-generated method stub
		
		
	}
	@Override
	public boolean isContain(T data) {
		// TODO Auto-generated method stub
	
		return false;
	}
	@Override
	public int indexOf(T data) {
		// TODO Auto-generated method stubNode  p = top;
	
		return -1;
	}
	@Override
	public int size() {
		// TODO Auto-generated method stub
		return 0;
	}
	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return false;
	}
	
	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new LinkedListIterator();
	}
	
	class LinkedListIterator implements Iterator<T>{
	
		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
		
			return null;
		}
		
	}

}

