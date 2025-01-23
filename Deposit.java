public class Deposit {
    int depositID ;
    int accountID ;
    double accountAmount ;
    double amount ;
    String location;
    String date ;

    public Deposit(int accID , double amount ){

        accountID = accID ;
        this.amount = amount ;

    }
}
