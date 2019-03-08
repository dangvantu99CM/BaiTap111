package student;

/**
 *
 * @author DangVanTu
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Scanner;

public class StudentManager {

    private ArrayList<Student> list;
    Scanner sc = new Scanner(System.in);
    StudentInfo si = new StudentInfo();

    public StudentManager() {
        si.input();
        list = si.getListStudent();
    }

    public ArrayList<Student> getList() {

        return list;
    }

    public void setList(ArrayList<Student> list) {
        this.list = list;
    }

    public void removeStudent() {
        boolean kt = true;
        do {
            System.out.println("Nhap ma sinh vien can xoa:");
            String msv = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMsv().equals(msv)) {
                    list.remove(i);
                    kt = false;
                }
            }
            if (list.size() == list.size() + 1) {
                System.out.println("Ma sinh vien can xoa khong co trong danh sach sinh vien.Hay Nhap Lai MSV!!!!");
            }

        } while (kt);
        System.out.println("Danh Sach sinh vien sau khi xoa: ");
        si.prinToFile("Student.txt", list);
        // si.printFileToScreen("Student.txt");
        si.printToScreen(list);

    }

    public void EditStudent() {

        boolean kt = true;
        do {
            int dem = 0;
            System.out.println("Nhap msv can sua: ");
            String ms = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (ms.equals(list.get(i).getMsv())) {
                    dem = dem + 1;
                    System.out.println("Nhap lai thong tin sinh vien: ");
                    String name = sc.nextLine();
                    String msv = sc.nextLine();
                    String address = sc.nextLine();
                    double gpa = Double.parseDouble(sc.nextLine());
                    int birthyear = Integer.parseInt(sc.nextLine());
                    Student stu = new Student(name, msv, address, gpa, birthyear);
                    list.set(i, stu);
                    kt = false;
                }
            }
            System.out.println(dem);
            if (dem == 0) {
                System.out.println("Sinh vien can sua khong co trong danh sach. Hay Nhap lai cho dung!");
            }
        } while (kt);
        si.prinToFile("Student.txt", list);
        si.printToScreen(list);
    }

    public void addStudentsTolist() {
        System.out.print("Nhap so sinh vien can them : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String msv = sc.nextLine();
            String address = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            int birthyear = Integer.parseInt(sc.nextLine());
            Student st = new Student(name, address, msv, gpa, birthyear);
            list.add(st);
        }
        System.out.println("Danh Sach Sinh Vien Sau Khi Them: ");
        si.prinToFile("Student.txt", list);
        si.printToScreen(list);
    }

    public void searchStudent() {
        boolean kt = true;
        int dem = 0;
        do {
            System.out.println("Nhap ma sinh vien can tim kiem: ");
            String msv = sc.nextLine();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getMsv().equals(msv)) {
                    System.out.println(list.get(i).toString());
                    dem++;
                    kt = false;
                    try {
                        Formatter pri = new Formatter(new File("Student.txt"));
                        pri.format("%s\n", list.get(i).toString());
                        pri.close();
                    } catch (FileNotFoundException e) {
                        System.err.println("File k ton tai");
                    }
                }
            }
            if (dem == 0) {
                System.out.println("Nhap lai ma sinh vien can tim kiem!!!");
            }

        } while (kt);
    }
    // sap xep Sinh vien theo ten sinh vien

    public void sortStudentByName() {
        Collections.sort(list, new SortStudentsByName());
        si.prinToFile("Student.txt", list);
        si.printToScreen(list);
    }
// sap xep sinh vien theo Gpa

    public void sortStudentByGpa() {
        Collections.sort(list, new SortStudentByGpa());
        si.prinToFile("Student.txt", list);
        si.printToScreen(list);
    }

}
