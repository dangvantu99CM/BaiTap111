/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author lenovo i3
 */
public class Test {
    
    private Shape[] arrshape;
    
    public Test(){
        arrshape = new Shape[3];
        arrshape[0] = new Point(1, 0, "Point");
        arrshape[1] = new Circle(1, 2, "Circle", 10);
        arrshape[2] = new Cylinder(1, 2, "Cylinder", 2, 3.5);
    }
    public static void main(String[]args){
        Test t = new Test();
        for(Shape s : t.arrshape){
            System.out.println(s.toString());
            
        }
        
        
    }
}
