package DemTanSuatTu;

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
    public Node getTop(){
        return top;
    }

    @Override
    public void add(T data) {
        // TODO Auto-generated method stub
        Node e = new Node();
        e.data = data;
        Node p = top;
        if (top != null) {
            e.next = p;
            top = e;
        } else {
            top = e;
        }

    }

    @Override
    public T get(int i) {
        int j = 0;
        Node p = top;
        Node e_search = null;
        T get_data = null;
        if (top != null) {
            while (p != null) {
                if (i == j) {
                    e_search = p;
                    get_data = e_search.data;
                    break;
                }
                p = p.next;
                j++;
            }
        }
        return get_data;
    }

    @Override
    public void set(int i, T data) {
        // TODO Auto-generated method stub
        Node p = top;
        Node p1 = bot;
        Node e = new Node();
        e.data = data;

        if (i == 0) {
            e.next = p;
            top = e;
        } else {
            Node e_serch = null;
            int j = 0;
            while (p != null) {
                if (i == (j + 1)) {
                    // tim kiem phan tu trung voi vi tri i khi da loai bo 2 vi tri dac biet
                    e_serch = p;
                    //bat dau qua trinh gan
                    // gan phan tu ke tiep cua phan tu can chen bang phan tu ke tiep cua phan tu tim dc tai j
                    e.next = e_serch.next;
                    //gan phan tu ke tiep cua phan tu tim dc tai j = phan tu can chen
                    // chen thanh cong
                    e_serch.next = e;
                    break;
                }
                p = p.next;
                j++;
            }

        }
        remove(i + 1);

    }

    @Override
    public void remove(int i) {
        // TODO Auto-generated method stub
        Node p = top.next;
        Node q = top;
        if (i == 0) {
            top = top.next;
        } else {
            int j = 1;

            while (p != null) {
                if (i == j) {
                    q.next = p.next;
                    break;

                }

                q = q.next;
                p = p.next;

                j++;
            }

        }

    }

    @Override
    public boolean isContain(T data) {
        // TODO Auto-generated method stub
        Node p = top;
        Node e = new Node();
        e.data = data;
        while (p != null) {
            if (p.data.equals(e.data)) {
                return true;
            }
            p = p.next;
        }

        return false;
    }

    @Override
    public int indexOf(T data) {
        Node p = top;
        Node e1 = new Node();
        e1.data = data;

        int j = 0;
        int index = -1;
        if (top != null) {
            while (p != null) {

                if (p.data.equals(e1.data)) {
                    index = j;
                    break;
                }

                p = p.next;
                j++;
            }
        }
        return index;
    }

    @Override
    public int size() {
        n = 0;
        Node p = top;
        while (p != null) {
            p = p.next;
            n++;
        }
        return n;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return top == null;
    }

    @Override
    public Iterator<T> iterator() {
        // TODO Auto-generated method stub
        return new LinkedListIterator();
    }

    class LinkedListIterator implements Iterator<T> {

        @Override
        public boolean hasNext() {
            // TODO Auto-generated method stub
            return top != null;
        }

        @Override
        public T next() {
            // TODO Auto-generated method stub
            T e = top.data;
            top = top.next;
            return e;
            
        }

    }

    public void printObject() {
        Node p = top;
        while (p != null) {
            System.out.println(p.data.toString());
            p = p.next;
        }
    }

    public static void main(String[] args) {
        SimpleLinkedList<String> stack = new SimpleLinkedList<>();
        stack.add("cho");
        stack.add("meo");
        System.out.println(stack.isContain("meo"));
    }

}
