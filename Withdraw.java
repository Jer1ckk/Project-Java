public class Withdraw {
    int withdrawID;
    int accountID ;
    double accountAmount;
    double amount ;
    String date ;

    public Withdraw(int accID , double amount, String date ){
        accountID = accID ;
        this.amount = amount ;
        this.date = date ;
    }
}
