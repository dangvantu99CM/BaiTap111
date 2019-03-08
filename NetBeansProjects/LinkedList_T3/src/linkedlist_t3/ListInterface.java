
package linkedlist_t3;

import java.util.Iterator;
import javax.swing.text.html.HTMLDocument;

/**
 *
 * @author QuyenTeacher
 */
public interface ListInterface<T> extends Iterable{
    
    public void set(int i, T data);
    public void add(T data);
    public T get(int i);
    public void remove(int i);
    public boolean isContain(T data);
    public int indexOf(T data);
    public int size();
    public boolean isEmpty();

    
}
