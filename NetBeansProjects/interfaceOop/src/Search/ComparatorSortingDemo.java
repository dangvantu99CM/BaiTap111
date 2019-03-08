/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * @author lenovo i3
 */
public class ComparatorSortingDemo {
    public static void main(String[] args) {
        Person person1 = new Person("Marry", 20);
        Person person2 = new Person("Tom", 21);
        Person person3 = new Person("Daniel", 21);
        Person person4 = new Person("Mischa", 18);
        Person person5 = new Person("Christian", 20);
 
        // Một mảng chưa được sắp xếp.
        Person[] array = new Person[] { person1, person2, person3, person4, person5 };
 
        // Sắp xếp mảng, sử dụng: <T> Arrays.sort(T[],Comparator<? supers T>).
        // Và cung cấp một Comparator (Bộ so sánh).
        
        Arrays.sort(array, new PersonComparator());
 
        for (Person person : array) {
            System.out.println("Person: " + person.getAge() + " / " + person.getFullName());
        }
 
        System.out.println("------------------------");
 
        // Đối với một danh sách:
        List<Person> list = new ArrayList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
 
        // Sắp xếp danh sách sử dụng:
        // <T> Collections.sort(List<T>, Comparator<? supers T>).
        // Và cung cấp một Comparator (Bộ so sánh).
        Collections.sort(list, new PersonComparator());
 
        for (Person person : list) {
            System.out.println("Person: " + person.getAge() + " / " + person.getFullName());
        }
    }
}
