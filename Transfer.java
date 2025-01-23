public class Transfer {
    int transferID;
    int fromAccountID;
    double fromAccountAmount;
    int toAccountID;
    double toAccountAmount;
    double amount;
    String date;

    public Transfer(int fromAccountID,  int toAccountID ,double amount){
        this.fromAccountID = fromAccountID ;
        this.toAccountID = toAccountID ;
        this.amount = amount ;
    }
    
}