package DataStruct.Queces;

import java.util.Iterator;

/**
 *
 * @author vantu
 */
public class LinkedListQueue<T> implements QueueInterface<T> {

    /**
     *
     * @param element purpose : add phan tu moi vao trong Queues
     */
    class Node {

        T data;
        Node next;

        Node(T data) {
            this.data = data;
            next = null;
        }
    }
    Node q = null;

    @Override

    public void enqueue(T element) {
        Node e = new Node(element);
        if (isEmpty()) {
            q = e;
        }
        e.next = q;
        q = e;

    }

    /**
     *
     * @return an element first in Queue
     */
    @Override
    public T dequeue() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     *
     * @return true if Queue is null and false if Queue is not null
     *
     */
    @Override
    public boolean isEmpty() {
        return q == null;
    }

    /**
     *
     * @return danh sach cac doi tuong can duyet qua thong qua doi tuong
     * listQueue khi ma Queue is not null
     */
    @Override
    public Iterator<T> iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void printObject() {
        Node p = q;
        while(p != null){
            System.out.println(p.data);
            p = p.next;
        }
    }

    public static void main(String[] args) {
        LinkedListQueue<String> lq = new LinkedListQueue<>();
        lq.enqueue("cho");
        lq.enqueue("meo");
        lq.enqueue("lon");
        lq.enqueue("ga");
        lq.printObject();
        
    }

}
