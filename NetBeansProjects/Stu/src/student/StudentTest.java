package student;

/**
 *
 * @author lenovo i3
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class StudentTest {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Show Menu : ");
        System.out.println("Chon 1 trong cac muc sau: ");
        System.out.println("1. Sửa thông tin sinh viên");
        System.out.println("2. Sắp xếp sinh viên theo gpa");
        System.out.println("3. Sắp xếp sinh viên theo tên");
        System.out.println("4. Thêm sinh viên");
        System.out.println("5. Xóa thông tin sinh viên");
        System.out.println("6. Tìm kiếm thông tin sinh viên");
        int n = Integer.parseInt(sc.nextLine());
        StudentManager sm = new StudentManager();
        switch (n) {
            case 1:
                sm.EditStudent();
                break;
            case 2:
                
                sm.sortStudentByGpa();
                break;

            case 3:
                sm.sortStudentByName();

                break;
            case 4:
                sm.addStudentsTolist();
                break;
            case 5:
                sm.removeStudent();
                break;
            case 6:
                sm.searchStudent();

                break;

        }
    }

}
