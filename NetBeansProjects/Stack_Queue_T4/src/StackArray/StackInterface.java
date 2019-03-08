/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StackArray;

/**
 *
 * @author vantu
 */
public interface StackInterface<T> extends Iterable<T>{

    public void push(T element);

    public T pop();

    public boolean isEmpty();
    
    public T peek();// method >> lay ra phan tu nhin tren dinh cua Stack >> k lam mat
}
