package Student;
public class Student{
    private String name, address, msv;
    private double gpa;
    private int birthyear;
    public Student(String name, String msv, String address, double gpa, int birthyear){
        super();
        this.address = address;
        this.birthyear =birthyear;
        this.gpa = gpa;
        this.msv = msv;
        this.name = name ;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the msv
     */
    public String getMsv() {
        return msv;
    }

    /**
     * @param msv the msv to set
     */
    public void setMsv(String msv) {
        this.msv = msv;
    }

    /**
     * @return the gpa
     */
    public double getGpa() {
        return gpa;
    }

    /**
     * @param gpa the gpa to set
     */
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    /**
     * @return the birthyear
     */
    public int getBirthyear() {
        return birthyear;
    }

    /**
     * @param birthyear the birthyear to set
     */
    public void setBirthyear(int birthyear) {
        this.birthyear = birthyear;
    }
    public String toString(){
        return msv + "  " + name + " " + address + " "+ birthyear + " " + gpa;
    }
}