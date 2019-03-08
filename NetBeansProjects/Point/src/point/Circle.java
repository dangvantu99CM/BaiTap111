package point;

import point.Point;

/**
 *
 * @author VanTu
 */
public class Circle extends Point {

    private double radius;

    public void setRadius(double r) {
        radius = (r >= 0 ? r : 0.0);
    }

    public Circle() {
        super();
        
        setRadius(0);
    }

    public Circle(int a, int b, double r) {
        super(a, b);
        setRadius(r);
        System.out.println("TO STRING Circle" + toString());
        
    }

    public double area() {
        return Math.PI * radius * radius;
    }

    public String toString() {
        //  return "Tam "+ getPointOx() + " " + getPointOy()
        return super.toString()
                + "Ban Kinh " + radius;
    }

}
