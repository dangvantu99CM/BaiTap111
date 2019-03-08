/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DemTanSuatTu;

/**
 *
 * @author vantu
 */

public interface ListInterface<T> extends Iterable<T>{

	public void add(T data);
	public T get(int i);
	public void set(int i, T data);
	public void remove(int i);
	public boolean isContain(T data);
	public int indexOf(T data);
	public int size();
	public boolean isEmpty();
}

