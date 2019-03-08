package point;

/**
 *
 * @author lenovo i3
 */
public class Point {

    private int x;
    private int y;

    public Point() {
        setPoint(0, 0);
        
    }

    public Point(int a, int b) {
        setPoint(a, b);
        System.out.println("TO STRING POINT" + toString());
    }

    public void setPoint(int a, int b) {
        x = a;
        y = b;
    }

    public int getPointOx() {
        return x;
    }

    public int getPointOy() {
        return y;
    }

    public String toString() {
        return "(" + x + "," + y + ")";
    }

}
