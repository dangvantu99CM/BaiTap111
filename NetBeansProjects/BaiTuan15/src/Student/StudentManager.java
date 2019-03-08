package Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Formatter;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author DANG VAN TU
 *
 */
public class StudentManager {

    private Scanner sc = new Scanner(System.in);
    private StudentInfo si = new StudentInfo();
    private ArrayList<Student> List = new ArrayList<Student>();
   
    public StudentManager(ArrayList<Student> List){
        super();
        this.List = List;
    }
    StudentManager sm = new StudentManager(si.getListStudent());
    public void addStudentsToList() {
        System.out.print("Nhap so sinh vien can them : ");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String msv = sc.nextLine();
            String address = sc.nextLine();
            double gpa = Double.parseDouble(sc.nextLine());
            int birthyear = Integer.parseInt(sc.nextLine());
            Student st = new Student(name, address, msv, gpa, birthyear);
            sm.List.add(st);
     }
        System.out.println("Danh Sach Sinh Vien Sau Khi Them: ");
//        si.printStudentToFile("InFoStudent.txt");
//        si.readfile("InFoStudent.txt");
          si.printToScreen(sm.List);
    }

    public void removeStudents() {
        boolean kt = true;
        do{
        System.out.println("Nhap ma sinh vien can xoa: ");
        String msv = sc.nextLine();
        for (int i = 0; i < si.infoOfStudents().size(); i++) {
            if (msv == si.infoOfStudents().get(i).getMsv()) {
                si.infoOfStudents().remove(i);
                kt = false;
            }
        }
        if (si.infoOfStudents().size() != si.infoOfStudents().size() + 1) {
            System.out.println("Ma sinh vien can xoa khong co trong danh sach sinh vien");
        }
        }
        while(kt);
       
//        si.printStudentToFile("InFoStudent.txt");
//         si.readfile("InFoStudent.txt");
        
    }

    public void EditStudent() {
        
        boolean kt = true;
        do{
           
        System.out.println("Nhap msv can sua: ");
        String ms = sc.nextLine();
        int dem = 0;
        for (int i = 0; i < si.infoOfStudents().size(); i++) {
            if (ms == si.infoOfStudents().get(i).getMsv()) {
                dem++;
                System.out.println("Nhap lai thong tin sinh vien: ");
                String name = sc.nextLine();
                String msv = sc.nextLine();
                String address = sc.nextLine();
                double gpa = Double.parseDouble(sc.nextLine());
                int birthyear = Integer.parseInt(sc.nextLine());
                Student stu = new Student(name, msv, address, gpa, birthyear);
                si.infoOfStudents().set(i, stu);
                kt = false;
            }
        }
        if (dem == 0) {
            System.out.println("Sinh vien can sua khong co trong danh sach. Hay Nhap lai cho dung!");      
        }
        }
        while(kt);
//        si.printStudentToFile("InFoStudent.txt");
//        si.readfile("InFoStudent.txt");

    }

    public void SortGpaStudents() {
        for (int i = 0; i < si.infoOfStudents().size() - 1; i++) {
            for (int j = i + 1; j < si.infoOfStudents().size(); j++) {
                if (si.infoOfStudents().get(i).getGpa() < si.infoOfStudents().get(j).getGpa()) {
                    Student st = new Student(si.infoOfStudents().get(i).getName(), si.infoOfStudents().get(i).getMsv(), si.infoOfStudents().get(i).getAddress(), si.infoOfStudents().get(i).getGpa(), si.infoOfStudents().get(i).getBirthyear());
                    Student st1 = new Student(si.infoOfStudents().get(i).getName(), si.infoOfStudents().get(i).getMsv(), si.infoOfStudents().get(i).getAddress(), si.infoOfStudents().get(i).getGpa(), si.infoOfStudents().get(i).getBirthyear());
                    Student st2 = new Student(si.infoOfStudents().get(j).getName(), si.infoOfStudents().get(j).getMsv(), si.infoOfStudents().get(j).getAddress(), si.infoOfStudents().get(j).getGpa(), si.infoOfStudents().get(j).getBirthyear());
                    st1 = st2;
                    st2 = st;
                }
            }
        }
//        si.printStudentToFile("InFoStudent.txt");
//        si.readfile("InFoStudent.txt");

    }

    public void SortNameStudents() {
        for (int i = 0; i < si.infoOfStudents().size() - 1; i++) {
            for (int j = i + 1; j < si.infoOfStudents().size(); j++) {
                if (si.infoOfStudents().get(i).getName().compareTo(si.infoOfStudents().get(j).getName()) > 0) {
                    Student st = new Student(si.infoOfStudents().get(i).getName(), si.infoOfStudents().get(i).getMsv(), si.infoOfStudents().get(i).getAddress(), si.infoOfStudents().get(i).getGpa(), si.infoOfStudents().get(i).getBirthyear());
                    Student st1 = new Student(si.infoOfStudents().get(i).getName(), si.infoOfStudents().get(i).getMsv(), si.infoOfStudents().get(i).getAddress(), si.infoOfStudents().get(i).getGpa(), si.infoOfStudents().get(i).getBirthyear());
                    Student st2 = new Student(si.infoOfStudents().get(j).getName(), si.infoOfStudents().get(j).getMsv(), si.infoOfStudents().get(j).getAddress(), si.infoOfStudents().get(j).getGpa(), si.infoOfStudents().get(j).getBirthyear());
                    st1 = st2;
                    st2 = st;
                }
            }
        }
//        si.printStudentToFile("InFoStudent.txt");
//        si.readfile("InFoStudent.txt");

    }

    public void searchStudent() {
        System.out.println("Nhap ma sinh vien can tim kiem: ");
        boolean kt = true;
        do {            
            try {
                Formatter printer = new Formatter(new File("InFoStudent.txt"));
                String msv = sc.nextLine();
                int dem = 0;
                for (int i = 0; i < si.infoOfStudents().size(); i++) {
                    if ( msv == si.infoOfStudents().get(i).getMsv()) {
                        System.out.println(si.infoOfStudents().get(i).toString());
                        dem++;
                        printer.format("%s",si.infoOfStudents().get(i).toString());
                        printer.close();
                        kt = false;
                    }
                }
                if(dem == 0){        
                    System.out.println("Nhap lai msv can tim");
                }
            }
            catch(FileNotFoundException er){
                            System.out.println("File Khong Ton Tai!!!");
            }
        }
        while(kt);
        } 
}
            
        