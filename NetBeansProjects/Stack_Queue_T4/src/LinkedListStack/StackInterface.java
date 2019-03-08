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
public interface StackInterface<T> extends Iterable<T>{

    public void push(T element);

    public T pop();

    public boolean isEmpty();
}

