// Bai 2 >> Lap trinh huong doi tuong >> chuong 11
public class Date {
    int year ;
    int month;
    int day;
    public Date(){
        this.year = 0;
        this.month = 0;
        this.day = 0 ;
        
    }
    public Date(int year, int month, int day){
        this.year  = year;
        this.month = month;
        this.day = day;
    }
    public static void main(String [] args){
        Date birthday = new Date(1999,11,2);
        System.out.println(birthday);
        System.out.println(birthday.day + " " + birthday.month + " " + birthday.year);
    }
}
