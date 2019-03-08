package quanlysvkhtn;

public class QuanLySVKHTN {

    private String name;
    private String msv;
    private double diem;
    private String address;
    private int age;
   

    public QuanLySVKHTN(String name,String msv, double diem,String address,int age) {
        this.name = name;
        this.msv = msv;
        this.diem = diem;
        this.address = address;
        this.age = age;
        
    }
    public void print(){
        System.out.println(name + " " + msv + " " + diem);
    }
    
}
