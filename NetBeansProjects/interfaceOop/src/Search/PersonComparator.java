/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Search;

import java.util.Comparator;

/**
 *
 * @author lenovo i3
 */
public class PersonComparator implements Comparator<Person> {

    public int compare(Person o1, Person o2) {
        // Hai đối tượng null coi như bằng nhau.
        if (o1 == null && o2 == null) {
            return 0;
        }
        // Nếu o1 là null, coi như o2 lớn hơn
        if (o1 == null) {
            return -1;
        }
        // Nếu o2 là null, coi như o1 lớn hơn.
        if (o2 == null) {
            return 1;
        }
        // Nguyên tắc:
        // Sắp xếp tăng dần theo tuổi.
        int value = o1.getAge() - o2.getAge();
        if (value != 0) {
            return value;
        }
        // Nếu tuổi giống nhau, thì so sánh fullName.
        // So sánh theo Alphabet (chữ cái).
        value = o1.getFullName().compareTo(o2.getFullName());
        return value;
    }
}
