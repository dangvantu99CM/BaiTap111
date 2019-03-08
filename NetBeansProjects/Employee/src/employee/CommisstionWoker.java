/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author vantuPro
 */
public class CommisstionWoker extends Employee{
    private double luonghoahong;
    private int tongsohang;
    private double luongcb;
    public CommisstionWoker(String name, String mnv , double lcb, double luonghh,int tonghang){
        super(name,mnv);
        setLuongcb(lcb);
        setLuonghh(luonghh);
        settonghang(tonghang);
        
    }
    public void setLuongcb(double s){
        luongcb = s>0?s:0;
    }
    public void setLuonghh(double hh){
        luonghoahong = hh>0?hh:0;
    }
    public void settonghang(int th){
        tongsohang = th>0?th:0;
    }
    

    @Override
    public double tongluong() {
        return luongcb + tongsohang*luonghoahong;
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    public String toString()
    {
        return "Commission  " + "\n" + super.toString() + "\n" + "Tong luong : " +  tongluong();
    }
}
