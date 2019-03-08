
package employee;

/**
 *
 * @author VanTu
 */
public class HourlyWoker extends Employee{
    private int hourNumber;
    private double lcb;
    private double luong1h;
    public HourlyWoker(String name, String mnv , int sogio , double lcb, double  luong1h){
        super(name,mnv);
        setSoGio(sogio);
        setlcb(lcb);
        
    }
    public void setSoGio(int sogio){
        hourNumber = sogio>0?sogio:0;
    }
    public void setlcb(double lcb){
       this.lcb = lcb>0?lcb:0;
    }
    public void setl1h(double l1h){
       this.luong1h = l1h>0?l1h:0;
    }

    @Override
    public double tongluong() {
        return lcb + hourNumber*luong1h;
      //  throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString()
    {
        return "Hourly Worker  " + "\n" + super.toString() + "\n" + "Tong luong : " +  tongluong();
    }
}
