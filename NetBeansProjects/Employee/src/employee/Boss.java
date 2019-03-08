
package employee;

/**
 *
 * @author VantuPro
 */
public class Boss extends Employee{
    
    private double luongcb;
    
    public Boss(String name,String mnv, double luongcb){
        super(name, mnv);
        this.luongcb = luongcb;
                
    }
 
    @Override
    public double tongluong() {
       return luongcb;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public String toString(){
        return "Boss \n " + super.toString() + "\n" + "Luong co ban: " + luongcb;
    }
    
}
