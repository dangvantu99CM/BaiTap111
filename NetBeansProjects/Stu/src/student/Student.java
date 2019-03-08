package student;
import java.util.Collections;
import java.util.Comparator;

public class Student {
	private String name,msv,address;
	private double gpa;
	private int birthyear;
	public Student(String name, String msv, String address, double gpa, int birthyear) {
		
		this.name = name;
		this.msv = msv;
		this.address = address;
		this.gpa = gpa;
		this.birthyear = birthyear;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMsv() {
		return msv;
	}
	public void setMsv(String msv) {
		this.msv = msv;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", msv=" + msv + ", address=" + address + ", gpa=" + gpa + ", birthyear="
				+ birthyear + "]";
	}
	public int getBirthyear() {
		return birthyear;
	}
	public void setBirthyear(int birthyear) {
		this.birthyear = birthyear;
	}
        public static Comparator<Student> compare = new Comparator<Student>(){
            public int compare(Student o1, Student o2){
                if(o1.getName().compareTo(o2.getName())== 0){
                    return o1.getMsv().compareTo(o2.getMsv());
                }
                else{
                    return o1.getName().compareTo(o2.getName());
                }
            }
        };
	
	
	
}
