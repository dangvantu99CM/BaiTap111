import Demo.Demo;// truy cap den package Demo >> truy cap den lop demo
import java.lang.System;// import su dung den lop System >> trong package java.lang
import java.lang.String;
public class Malicious {
    public static void main(String args[]){
    maliciousMethod(new CreditCard());
}
    static void maliciousMethod(CreditCard card){
    card.expenses = 0;
    System.out.println(card.cardNumber);
}
}

