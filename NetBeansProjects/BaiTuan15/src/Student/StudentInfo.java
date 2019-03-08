package Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.Scanner;

public class StudentInfo {

    private static ArrayList<Student> ListStudent = new ArrayList<Student>();
    private int n;

    public ArrayList<Student> infoOfStudents() {
        System.out.println("Nhap Danh Sach Sinh Vien");
        Scanner sc = new Scanner(System.in);
        n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String msv = sc.nextLine();
            String address = sc.nextLine();
            int birthyear = Integer.parseInt(sc.nextLine());
            double gpa = Double.parseDouble(sc.nextLine());
            Student student = new Student(name, msv, address, gpa, birthyear);
            getListStudent().add(student);
        }
        sc.close();
        return getListStudent();
        
    }

    public void printStudentToFile(String fileName,ArrayList<Student> list) {
        // ghi du lieu khi doc tu ban phim ra file
        try {
            Formatter printer = new Formatter(new File(fileName));
            printer.format("%s\n", n);
            for (int i = 0; i < n; i++) {
                printer.format("%s\n", list.get(i).toString());
            }
            printer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public void readfile(String fileName) {
        // ghi du lieu tu file ra man hinh
        try {
            Scanner reader = new Scanner(new File(fileName));
            while (reader.hasNext()) {
                System.out.println(reader.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
   
    public void printToScreen(ArrayList<Student> List){
        for(int i = 0; i < getListStudent().size(); i++){
        System.out.print(getListStudent().get(i).toString());
    }
}

    /**
     * @return the ListStudent
     */
    public  ArrayList<Student> getListStudent() {
        return ListStudent;
    }

    /**
     * @param aListStudent the ListStudent to set
     */
    public  void setListStudent(ArrayList<Student> aListStudent) {
        ListStudent = aListStudent;
    }
}
