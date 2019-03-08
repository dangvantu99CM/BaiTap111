/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nodeobject;

import java.util.Scanner;

/**
 *
 * @author vantu
 */
// bai toan : thuc hien tao ra 1 list danh sach cac doi tuong (hoao la node)
// cac doi tuong se lien ket voi nhau
// khi biet doi tuong dau se biet duoc doi tuong sau
interface List<E> {

    // xac dinh do dai cua mang
    int size(); // tu dinh nghia la cac phuong thuc public
    // them 1 phan tu vao mang 
    // them co 2 cach
    // c1 : su dung ngan xep(stack) >> ban chat cua cau truc du lieu nay la 
    // phan tu vao sau dc lay ra truoc 
    // c2 : su dung hang doi (quece),phan tu nao vao truoc se phai cho doi ra sau

    void add(int e);

    // in ra tung doi tuong trong list 
    void printObject();

    // them doi tuong vao 1 vi tri duoc chi dinh san
    void add(int i, int e);

}
// tao lop cac doi tuong chua cac node >> voi 1 kieu du lieu tong quat

public class NodeObject<E> implements List<E> {

    // inner class >> tao ra doi tuong node tuong ung
    // chi duoc su dung trong chinh class nay
    Scanner sc = new Scanner(System.in);

    class node {

        private node next;
        private int e;

        public node(int element) {
            e = element;
            next = null;
        }
        public node(){
            
        }
    }
    private node list_init = new node(0);

    //ghi de cac phuong thuc trong interface >> List<Object>
    @Override
    public void add(int e) {
        // phuong thuc them doi tuong node dua vao ctdl kieu hang doi 
        // vao truoc ra truoc (FIFO)
        //vd neu list >> la >> 3 , 5 , 7 , null
        //khi dung phuong thuc nay them 9 vao  >> them vao cuoi
        // list >> 3 5 7 9 
        node p = new node(e);
        if (list_init != null) {
            node q = list_init;
            while (q.next != null) {
                q = q.next;
            }
            q.next = p;

        } else {
            list_init = p;
        }
    }

    public int getDataElement(int i) {
        node p = list_init;
        int j = 0;
        node e_se = null;
        while (p != null) {
            if (i == j) {
                e_se = p;
            }
            p = p.next;
            j++;
        }
        return e_se.e;
    }

    public void remove(int i) {
        node p = list_init.next;
        node q = list_init;
        if (i == 0) {
            list_init = list_init.next;
        } else {
            int j = 1;
            node e_search = null;
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

    // phuong thuc them doi tuong vao node (list)
    // su dung ctdl >> ngan xep >> vao truoc >> ra sau (LIOF)
    // vd list >> 3 5 7
    // them vao 9 >> list >> them vao dau mang >> 9 3 5 7
    // vi 1 linked >> se co dinh dau cua no 
    // voi cach nay thi khi them phan tu vao dua cua list 
    // sau khi them xong phai cap nhat lai list do
    public void add_02(int e) {

        node p = new node(e);
        node q = list_init;
        p.next = q;
        // cap nhat lai head cua list 
        // gan phan tu dau bang p
        list_init = p;

    }

    @Override
    public int size() {
        int s = 0;
        node p = list_init;
        while (p != null) {
            s += 1;
            p = p.next;
        }
        return s;
    }

    @Override
    public void printObject() {
        node p = list_init;
        while (p != null) {
            System.out.println("This element of node " + p.e);
            p = p.next;
        }
    }
    // phuong thuc doi vi giua cac doi tuong
    public void sort(){
        // sap xep cac so tang dan
        node p = list_init;
        while(p != null){
            if(p.e > p.next.e){
                node temp = new node();
                temp.e = p.e;
                p.e = p.next.e;
                p.next.e = temp.e;
            }
            p = p.next;
        }
    }

    public int indexOf(int data) {
        node p = list_init;
        node e1 = new node(data);

        int j = 0;
        int index = -1;
        if (list_init != null) {
            while (p != null) {

                if (p.e == e1.e) {
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
    public void add(int i, int e) {
        int s = size();
        if (i == 0) {
            add_02(e);
        } else {

            node p = list_init;
            node e_serch = null;
            node q = new node(e);
            int j = 0;
            while (p != null) {
                if (i == (j + 1)) {
                    // tim kiem phan tu trung voi vi tri i khi da loai bo 2 vi tri dac biet
                    e_serch = p;
                    //bat dau qua trinh gan
                    // gan phan tu ke tiep cua phan tu can chen bang phan tu ke tiep cua phan tu tim dc tai j
                    q.next = e_serch.next;
                    //gan phan tu ke tiep cua phan tu tim dc tai j = phan tu can chen
                    // chen thanh cong
                    e_serch.next = q;
                    break;
                }
                p = p.next;
                j++;
            }

        }

    }

    // test get >> tra ve 1 phan tu trong mang
    public int get(int i) {
        int j = 0;
        node p = list_init;
        node e_search = null;
        int get_data = -1;
        if (list_init != null) {
            while (p != null) {
                if (i == j) {
                    e_search = p;
                    get_data = e_search.e;
                    break;
                }
                p = p.next;
                j++;
            }
        }
        return get_data;
    }

    // test add element of 
    public void add_test(int data) {
        node e = new node(data);

        node p = list_init;
        if (list_init != null) {
            e.next = p;
            list_init = e;
        } else {
            list_init = e;
        }
    }
    // test method set >> SimpleLinkedList
     public void set(int i, int data) {
        // them 1 phan tu vao dau
        node p = list_init;
//        node p1 = bot;
        node e = new node(data);
//        e.data = data;

        if (i == 0) {
            e.next = p;
            list_init = e;
        } else {
            node e_serch = null;
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
    }

    public static void main(String[] args) {

        NodeObject<Integer> n = new NodeObject<Integer>();

        n.add(4);
        n.add(5);
        n.add_02(1);
        n.add_02(2);
        n.add_02(3);
        n.add(9);
//        
//        n.add(10);
        int s = n.size();
        n.add(2, 2121);
        n.add(s - 1, 1000);
        n.add_test(211);
        n.set(2, 1999);
        System.out.println(s);
        System.out.println("get data of element : " + n.getDataElement(0));
        System.out.println("size : " + n.size());
        n.remove(8);
        System.out.println("index Of : " + n.indexOf(1000));
        System.out.println("Get data of element : " + n.get(100));
        n.sort();
        n.printObject();

    }

}
