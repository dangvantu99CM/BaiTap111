/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package XuLyNgoai;

import java.sql.Time;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.SimpleTimeZone;

/**
 *
 * @author lenovo i3
 */
public class LocalTimeDemo {

    public static void main(String[] args) throws ParseException {
        //time 16:45:55:222222146
//	  LocalTime localTime = LocalTime.of(16, 45, 55);
//          LocalTime lct = LocalTime.of
//	  System.out.println("Given Time: "+localTime);
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        Date date = format.parse("2012-12-13 14:54:30"); // mysql datetime format
//        GregorianCalendar calendar = new GregorianCalendar();
//        calendar.setTime(date);
//        System.out.println(calendar.getTime());
//        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//        String string = format.format(calendar.getTime());
//        System.out.println(string);
//        Time t = new Time(6, 30, 0);
//        System.out.println(t.toString());
        // lay thoi gian tu he thong
//        LocalTimeDemo l = new LocalTimeDemo();
//        l.getTimeInSystem();
//        l.getDateInSystem();
//addToDate();
        LocalTimeDemo lc = new LocalTimeDemo();
        lc.hanguixe();
        lc.hanguixeThang();
        

    }

    public Time getTimeInSystem() throws ParseException {
        Time today = new Time(System.currentTimeMillis());
        int hour = 0;
        int m = 0;
        int s = 0;
        hour = today.getHours();
        m = today.getMinutes();
        s = today.getSeconds();
//        System.out.println(today + "\t" + hour + "\t" + m + "\t" + s);
//
//        System.out.println();

        return today;

    }

    public String getDateInSystem() throws ParseException {
        
        Date today1 = new Date(System.currentTimeMillis());
        // System.out.println(today1);
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
        String date = dateformat.format(today1);
        //System.out.println(date);
//        Date d = new SimpleDateFormat("yyyy/MM/dd").parse(date);
//        System.out.println(d);

        return date;
    }
    public String hanguixe(){
        Calendar c1 = Calendar.getInstance();
       
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
       
        c1.setTime(new Date());
      
        c1.add(Calendar.DATE,1);
        String tplus = dateformat.format(c1.getTime());
      
        return tplus;
    }
    
    public String hanguixeThang(){
        Calendar c1 = Calendar.getInstance();
       
        SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/MM/dd");
       
        c1.setTime(new Date());
      
        c1.add(Calendar.DATE,30);
        String tplus = dateformat.format(c1.getTime());
        System.out.println(tplus);
        return tplus;
    }
    public static void addToDate(){

System.out.println("1. Add to a Date Operation\n");

SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");

//    Gets a calendar using the default time zone and locale.

Calendar c1 = Calendar.getInstance();

Date d1 = new Date();

System.out.println("Todays date in Calendar Format : "+c1);

System.out.println("c1.getTime() : "+c1.getTime());

System.out.println("c1.get(Calendar.YEAR): " + c1.get(Calendar.YEAR));


System.out.println("Todays date in Date Format : "+d1);

c1.set(2008,02 ,20); //(year,month,date)

System.out.println("c1.set(2008,02 ,20) : "+c1.getTime());

c1.add(Calendar.DATE,20);

System.out.println("Date + 20 days is : " + sdf.format(c1.getTime()));

System.out.println();

System.out.println("——————————————————-");
    }
}
