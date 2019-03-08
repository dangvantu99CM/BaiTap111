
public class CreditCard {
    String cardNumber;
    double expenses;
    void charge(double amount){
    expenses += amount;
}
    String getCardNumber(String password){
    if(password.equals("SECRET!3*!")){
    return cardNumber;
}
    return "robber";
}
}

