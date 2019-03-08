package java.multhreading;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author vantuPro
 */
public class JavaMulthreading implements Runnable {

    private String threadName;
    private Thread t;

    public JavaMulthreading(String threadName) {

        this.threadName = threadName;
        System.out.println("Creating: " + threadName);

    }

    @Override
    public void run() {
        System.out.println("Running: " + threadName);
        for (int i = 4; i > 0; i--) {
            System.out.println("Thread : " + threadName + " " + i);
            try {
                
                Thread.sleep(10000);
                
            } catch (InterruptedException ex) {
                
                System.out.println("Thread " + threadName +" interrupted. ");
    
            }
        }
        System.out.println("Thread " + threadName + " exiting.");
        
        
    }
    public void start(){
        System.out.println("Starting " + threadName);
        if(t == null){
            
            t = new Thread(this, threadName);
            t.start();
            
        }
    }
    public static void main(String[] args) {
        JavaMulthreading jmr = new JavaMulthreading("Thread -1");
        jmr.start();
        JavaMulthreading jmr1 = new JavaMulthreading("Thread -2");
        jmr1.start();
    }

}
