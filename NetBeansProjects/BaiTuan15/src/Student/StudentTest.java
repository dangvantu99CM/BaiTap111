package Student;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author DangVanTu
 */
public class StudentTest {
//    ArrayList<Student> List;
//    static 
//    public StudentTest(ArrayList<Student>List){
//        this.List = List;
//    }
//    static StudentTest st = new StudentTest(si.infoOfStudents());
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);            
        StudentInfo si = new StudentInfo();
        si.infoOfStudents();
        StudentManager sm = new StudentManager(si.getListStudent());
        System.out.println("Menu : ");
        boolean kt = true;
        do{
        try{    
        int n  = sc.nextInt();
        switch(n){
            case 1:
                sm.EditStudent();
                kt = false;
                break;
            case 2: 
                sm.SortGpaStudents();
                kt = false;
                break;
            case 3:
                sm.SortNameStudents();
                kt = false;
                break;
            case 4:
                sm.addStudentsToList();
                kt = false;
                break;
            case 5:
                sm.removeStudents();
                kt = false;
                break;
            case 6:
                sm.searchStudent();
                kt = false;
                break;
                
            default: 
                System.out.println("Nhap lai gia tri cua n nhe!!!!");
        }
        }
        catch(NumberFormatException nf){
                System.err.println("Hay Nhap lai gia tri cua n: ");
            }
        }while(kt); 

    }
}
