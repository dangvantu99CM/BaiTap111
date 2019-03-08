
package shape;

/**
 *
 * @author vantu
 */
public class Cylinder extends Circle{
    private double height;
    public Cylinder(double x, double y, String name, double r, double h){
        super(x, y, name, r);
        setH(h);
    }
    public void setH(double h){
        height = h>0?h:0;
    }
    public double dientichbemat(){
        return Math.PI*super.getR()*height + 2*super.arae();
    }
    public double thetich(){
        return height*super.arae();
    }
    public String toString(){
        return "Name : " + super.getName() +" , " + super.getToado() +  ", dien tich mat : " + dientichbemat() + " ,the tich : " +  thetich();
    }
    
}
