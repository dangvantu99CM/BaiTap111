
package student;

import java.util.Comparator;

/**
 *
 * @author VanTu
 */
public class SortStudentByGpa implements Comparator<Student> {
    @Override
    // sap xep diem sinh vien giam dan !!!
    
    public int compare(Student student1, Student student2) {
        if (student1.getGpa() <  student2.getGpa()) {
            return 1;
        }
        return -1;
    }

    
}



