/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TinhGiaTri;

/**
 *
 * @author vantu
 */
import java.util.Iterator;

public class LinkedListStack<T> implements StackInterface<T> {

    class Node {

        T element;
        Node next;

        public Node() {

        }

        public Node(T e) {
            element = e;
            next = null;
        }
    }

    Node stack = null;

    @Override
    public void push(T element) {
        // TODO Auto-generated method stub
        Node e = new Node(element);
        e.next = stack;
        stack = e;

    }

    @Override
    public T pop() {
        // TODO Auto-generated method stub

        Node p = stack;
        stack = stack.next;
        return p.element;

    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return stack == null;
//        return false;
    }
    
     public void printData() {
        Node p = stack;
        while (p != null) {
            System.out.println(p.element);
            p = p.next;
        }

    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new StackIterator();
    }
    

    class StackIterator implements Iterator<T> {

        private Node currentNode = stack;

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return currentNode != null;
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            T data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }

}
