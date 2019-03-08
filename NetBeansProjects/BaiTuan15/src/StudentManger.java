
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;
/**
 *
 * @author DangVanTu
 */
public class StudentManger {

    private int n;
    private Student[] students;

    public void readStudentsFromFile(String fileName) {
        // doc tu file student.txt
        try {
            Scanner reader = new Scanner(new File(fileName));
            n = Integer.parseInt(reader.nextLine());
            students = new Student[n];
            for (int i = 0; i < n; i++) {
                String id = reader.nextLine();
                String name = reader.nextLine();
                double score = Double.parseDouble(reader.nextLine());
                students[i] = new Student(id, name, score);
            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();

        }

    }

    public void sortByScore() {
        // sap xep sinh vien giam dan theo diem
        for (int i = 0; i < students.length - 1; i++) {
            for (int j = i + 1; j < students.length; j++) {
                if (students[i].getScore() < students[j].getScore()) {
                    Student t = new Student(students[i].getId(),students[i].getName(),students[i].getScore());
                    students[i] = students[j];
                    students[j] = t;
                }
            }

        }
    }

    public void printStudentsToFile(String fileName) {
        // ghi danh sach sinh vien ra file studentsSorted.txt
        // y tuong su dung Formatter
        try {
            Formatter printer = new Formatter(new File(fileName));
            printer.format("%d\n", n);// in ra tren tung  in ra so sinh vien
            // doc n 
            for (int i = 0; i < students.length; i++) {
                printer.format("%s\n", students[i].getId());
                printer.format("%s\n", students[i].getName());
                printer.format("%s\n", students[i].getScore());
            }
            printer.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    // ghi tung doi tuong sinh vien ra man hinnh
    public static void readFile(String fileName) {
        // phuong thuc doc tu file va ghi ket qua ra man hinh
        try {
            Scanner reader = new Scanner(new File(fileName));
            while (reader.hasNext()) {
                System.out.println(reader.nextLine());

            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        StudentManger sm = new StudentManger();
        sm.readStudentsFromFile("Student.txt");
        sm.sortByScore();
        sm.printStudentsToFile("studentsSort.txt");
        readFile("studentsSort.txt");
        readFile("Student.txt");
    }
}
