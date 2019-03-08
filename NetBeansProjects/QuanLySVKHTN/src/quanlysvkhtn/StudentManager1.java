package quanlysvkhtn;

import java.util.Scanner;

public class StudentManager1 {

    private int n;
    private QuanLySVKHTN ArrayStudent[];

    public void input() {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        ArrayStudent = new QuanLySVKHTN[n];
        for (int i = 0; i < n; i++) {
            String name = sc.nextLine();
            String msv = sc.nextLine();
            double diem = Double.parseDouble(sc.nextLine());
            int age = Integer.parseInt(sc.nextLine());
            String address = sc.nextLine();
            ArrayStudent[i] = new QuanLySVKHTN(name, msv, diem,address,age);
        }
    }

    public void print1() {
        for (int i = 0; i < ArrayStudent.length; i++) {
            ArrayStudent[i].print();
        }
    }

    public static void main(String[] args) {
        StudentManager1 sv = new StudentManager1();
        sv.input();
        sv.print1();
    }
    
}
