
package shape;

/**
 *
 * @author vanTuPro
 */
public class Circle extends Point{
    private double r;
    public Circle(double x, double y, String name,double r){
        super(x, y, name);
        setRadius(r);
    }
    public void setRadius(double r){
        this.r = r>0?r:0;
    }
    public double arae(){
       // System.out.println(Math.PI*r*r);
        return Math.PI*getR()*getR();
    }
    public double chuvi(){
        return 2*Math.PI*getR();
    }
    public String toString(){
        return "name : " + super.getName() + " , "+ super.getToado() + ", Dien tich : " + arae()+ ", chu vi: "+ chuvi();
    }

    /**
     * @return the r
     */
    public double getR() {
        return r;
    }
    
}
