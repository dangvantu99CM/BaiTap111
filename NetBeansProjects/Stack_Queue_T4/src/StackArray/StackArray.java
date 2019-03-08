/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackArray;

import java.util.Iterator;

/**
 *
 * @author vantu
 */
// idea : 
// y tuong cua ArrayStack 
// la gan 1 bien top tro vao dau mang 
// khi ta push 1 phan tu vao mang (vao dau mang)
// thi top phai tro sang o ke tiep >> top tang len 1
// nguyen tac cua stack >> muon lay ra duoc cac phan tu dang sau thi cac phan tu dung truoc no phai da duoc lay ra roi
// vi the co top = top - 1;
public class StackArray<T> implements StackInterface<T> {

    private int n;
    private T[] stack = null;
    private int top = 0;

    public StackArray(int n) {
        // ep stack ve kieu mang []T >> voi kieu du lieu tong quat la Object
        stack = (T[]) new Object[n];
    }

    @Override
    public void push(T element) {
        if (top <= stack.length - 1) {
            stack[top] = element;
            top++;
        } else {
            T[]stackArr2 = (T[])new Object[2*stack.length];
            for(int i = 0; i < stack.length; i++){
                stackArr2[i] = stack[i];
            }
            stackArr2[top] = element;
            
            stack = stackArr2;
            top++;
        }

    }

    @Override
    // lay ra khoi mang phan tu dung dau
    public T pop() {
        if (isEmpty()) {
            return null;
        } else {
            top = top - 1;
            return stack[top];
        }

    }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }

    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override

    public T peek() {
        if (isEmpty()) {
            return null;
        } else {
            // theo nguyen tac muon lay ra cac phan tu sau 
            // cac phan tu truoc phai da duoc lay ra
            // ci the peek >> la phan tu tai con tro top do - 1
            return stack[top - 1];
        }
    }
    public void printObject(){
        
        int count = top - 1;
        while(count >= 0){
            
            System.out.println(stack[count]);
            count--;
            
        }
        
    }
    
    public static void main(String[] args) {
        StackArray<String> arrStack = new StackArray<>(3);
        System.out.println("Stack data Structer: ");
        arrStack.push("cho");
        arrStack.push("meo");
        arrStack.push("lon");
        arrStack.push("ga");
        arrStack.push("bo");
        
        arrStack.printObject();
        System.out.println(arrStack.pop());
        arrStack.printObject();
    }

}
