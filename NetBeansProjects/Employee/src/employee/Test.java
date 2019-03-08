/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author VanTuPro
 */
public class Test {

    private Employee e;
    private CommisstionWoker c;
    private HourlyWoker h;
    private Boss b;

    public static void main(String[] args) {
        Test t = new Test();
        t.c = new CommisstionWoker("Linh", "001", 10000000, 200000, 100);
        t.b = new Boss("Boss Strong", "Bo doi", 100000000);
        t.h = new HourlyWoker("Nam", "002", 4000, 20000000, 300000);
        t.e = t.b;
        t.h = new HourlyWoker("Minh", "0099", 1000, 1000, 0);
        System.out.println(t.e.toString());
        t.e = t.c;
        System.out.println(t.e.toString());
        t.e = t.h;
        System.out.println(t.e.toString());

    }
}
