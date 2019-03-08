
package student;

/**
 *
 * @author lenovo i3
 */
import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.FileAlreadyExistsException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Formatter;
import java.util.Scanner;

public class StudentInfo {
	private ArrayList<Student> listStudent;
	private int n ;
       
	public ArrayList<Student> getListStudent() {		
               
            return listStudent;
	}
	public void setListStudent(ArrayList<Student> listStudent) {
		this.listStudent = listStudent;
	}
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap danh sach sinh vien:");
		listStudent =  new ArrayList<Student>();
                System.out.println("Số lượng sinh viên: ");
                while(true){
		n = Integer.parseInt(sc.nextLine());
		for(int i = 0; i < n ;i++) {
                        System.out.println("Tên Sinh Viên:");
			String name = sc.nextLine();                   
                        System.out.println("Mã Sinh Viên:");
			String msv = sc.nextLine();
                        System.out.println("Địa chỉ sinh viên:");
			String address = sc.nextLine();
                        
                        System.out.println("Điểm trung bình sinh viên:");                        
			double gpa = Double.parseDouble(sc.nextLine());                        
                        System.out.println("Năm sinh của sinh viên:");
			int birthyear = Integer.parseInt(sc.nextLine());
			listStudent.add(new Student(name,msv,address,gpa,birthyear));
		}
	}
        }
	public void prinToFile(String fileName,ArrayList<Student> st) {
		try {
			Formatter pri = new Formatter(new File(fileName));
			pri.format("%s\n", "Danh Sach sinh vien");
			pri.format("%s%d\n", "So luong sinh vien: ", n);
			for(int i = 0 ; i < st.size(); i++) {
				pri.format("%s\n",st.get(i).toString());
			}
			pri.close();
			
		}
		catch(FileNotFoundException er) {
			er.printStackTrace();
		}
	}
	public void printToScreen(ArrayList<Student> st) {
		for(int i = 0; i < st.size(); i++) {
			System.out.println(st.get(i).toString());
		}
		
	}
	// doc tu Danh sach sinh vien tu file 
	public void readFile(String fileName) {
		try {
		Scanner reader = new Scanner(new File(fileName));
		n = Integer.parseInt(reader.nextLine());
		for(int i = 0; i < n ; i++) {
			String name = reader.nextLine();
			String msv = reader.nextLine();
			String address = reader.nextLine();
			double gpa = reader.nextDouble();
			int birthyear = reader.nextInt();
			listStudent.add(new Student(name,msv,address,gpa,birthyear));
		}
		reader.close();
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	// ghi tu file ra man hin
	public void printFileToScreen(String fileName) {
		try {
		Scanner reader = new Scanner(new File(fileName));
		while(reader.hasNext()) {
			System.out.println(reader.nextLine());
		}
		
		}
		catch(FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	
}
