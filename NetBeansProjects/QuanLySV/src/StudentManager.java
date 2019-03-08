
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author DangVanTu
 */
public class StudentManager {

    private int n;
    private Student[] students;
    ;
    Scanner sc = new Scanner(System.in);
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
                    Student t = new Student(students[i].getId(), students[i].getName(), students[i].getScore());
                    students[i] = students[j];
                    students[j] = t;
                }
            }

        }
    }
    
    public void removeStudent(){
        // xoa sinh vien
        System.out.println("Nhap Ma sinh vien can xoa");
        String msv = sc.nextLine();
        for(int i = 0; i < n; i++){
            if(msv.equals(students[i].getId())){
            for(int j = i; j < n - 1 ; j++){
                students[j] = students[j+1];
            }
            n--;
            }
        }
        System.out.println(students.length);
        
            
    }
    public void addStudent(){
     
        
        try{
           Scanner read = new Scanner(new File("student2.txt"));
           n = Integer.parseInt(sc.nextLine());
           students = new Student[n];
            for (int i = 0; i < n; i++) {
                String id = read.nextLine();
                String name = read.nextLine();
                double score = Double.parseDouble(read.nextLine());
                students[i] = new Student(id, name, score);
            }
            read.close();
           
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }
        System.out.println("Nhap so sinh vien can them:");
        int num = Integer.parseInt(sc.nextLine());
        int reset = n;       
        n += num;
        System.out.println(n);
        for(int j = 0 ; j < num ; j++){
            String id = sc.nextLine();
            String name = sc.nextLine();
            double score = Double.parseDouble(sc.nextLine());                  
            students[reset + j] =  new Student(id,name,score);
        }   
    }

    

    public void printStudentsToFile(String fileName) {
        // ghi danh sach sinh vien ra file studentsSorted.txt
        // y tuong su dung Formatter
        try {
            Formatter printer = new Formatter(new File(fileName));
            printer.format("%d\n", n);// in ra tren tung  in ra so sinh vien
            // doc n 
            for (int i = 0; i < n; i++) {
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
    public void readFile(String fileName) {
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
        StudentManager sm = new StudentManager();
        sm.readStudentsFromFile("student2.txt");
        // sm.sortByScore();
        //sm.removeStudent();
        sm.addStudent();
        sm.printStudentsToFile("studentsSort1.txt");
        sm.readFile("studentsSort1.txt");
        sm.readFile("student2.txt");
    }
}
