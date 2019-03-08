package Demo; 
public class Demo{
    int myCount = 0;
     int ourCount = 0;
    void increment(){
    myCount++;
    ourCount++;
}
public static void main(String arg[]){
    Demo counter1 = new Demo();  
    Demo counter2 = new Demo();
    counter1.increment();
    counter1.increment();
    counter2.increment();
    System.out.println("counter 1: " +
    counter1.myCount + " " + counter1.ourCount);
    System.out.println("counter 2: " +
    counter2.myCount + " " + counter2.ourCount);
}
}