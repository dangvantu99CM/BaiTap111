/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedListStack;

/**
 *
 * @author lenovo i3
 */
import java.util.Iterator;

/**
 *
 * @author vantu
 */
// viet 1 cau truc du lieu kieu ngan xep 
// vao sau ra truoc
//luon lam viec voi top
// y tuong cua bao=i toan kiem tra tinh hop le la 
// tao ra cau truc du lieu kieu stack
// kiem tra cac dau mo dong ngoac xem cio dung hay khong
// dung >> true
///sai >> false
// dua ca cdau ngoac vao trong stack
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
//     Node p = stack;

    @Override

    // cau truc dl stack
    // vao sau ra truoc 
    // nen ta thuc hien them phan tu vao dau
    public void push(T element) {

//        Node p = stack;
        Node e = new Node(element);
        e.next = stack;
        stack = e;
    }

    @Override

    // lay ra dinh cua stack 
    // xoa luon phan tu do cua stack
    public T pop() {

        Node p = stack;
        stack = stack.next;
        return p.element;

    }

    @Override
    public boolean isEmpty() {
        return stack == null;
    }

    @Override
    // luu y ta thay thua ke giao dien Interator

    public Iterator<T> iterator() {
        return new StackIterator();
    }

    // vai tro sap xep lai theo yeu cau 
    // truot tren toan bo mang
    class StackIterator implements Iterator<T> {

        private Node currentNode = stack;

        @Override
        public boolean hasNext() {

            return currentNode != null;
        }

        @Override
        public T next() {
            T data = currentNode.element;
            currentNode = currentNode.next;
            return data;
        }
    }

    public void printData() {
        Node p = stack;
        while (p != null) {
            System.out.println(p.element);
            p = p.next;
        }

    }

    public static void main(String[] args) {
        LinkedListStack<Integer> stackTest = new LinkedListStack<>();
        stackTest.push(0);
        stackTest.push(1);
        stackTest.push(1000);
        stackTest.push(1001);
        stackTest.push(1002);
        stackTest.push(1003);
        stackTest.pop();
        stackTest.pop();
        stackTest.printData();

    }

}
