package shape;

/**
 *
 * @author vanTu
 */
public class Point implements Shape {

    private double x;
    private double y;
    private String name;

    public Point(double x, double y, String name) {

        this.x = x;
        this.y = y;
        this.name = name;

    }

    @Override
    public double area() {
        return 0.0;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public double chuvi() {
        return 0.0;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName() {
        return name;
        // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String toString() {
        return "name : " + name + " , "  + getToado() +" , Dien tich : " + area() + ", chu vi: " + chuvi();

    }
    public String getToado(){
        return "(x,y) -> " + "(" + x + "," + y + ")";
    }

    /**
     * @return the x
     */
    public double getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(double x) {
        this.x = x;
    }

    /**
     * @return the y
     */
    public double getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(double y) {
        this.y = y;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
