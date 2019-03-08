import point.Point; 
import point.Circle;


/**
 *
 * @author VanTuCM
 */
public class Test {

    public static void main(String[] args) {
         Point p1 = new Point();
         Point p2 = new Point();
         Circle c1 = new Circle(1,2,3);
         Circle c2 = new Circle(4,5,6);
         System.out.println(p1.toString());
         p1 = c1;// gan 1 doi tuong Circle cho tham chieu p1>> cha da thuc su tham chieu den con
         System.out.println(p1.toString());
         System.out.println(c2.toString());
         c2 = (Circle)p1;// ep kieu cho doi tuong cha p1 tham chieu den phuong thuc toString cua lop Circle
         System.out.println(c2.toString());
         System.out.println(c2.getPointOx());
         
         
    }
}
