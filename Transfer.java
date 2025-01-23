public class Transfer {
    int fromAccountID;
    int toAccountID;
    double amount;
    String date;

    Transfer(int fromAccountID, int toAccountID ,double amount , String date){
        this.fromAccountID = fromAccountID ;
        this.toAccountID = toAccountID ;
        this.amount = amount ;
        this.date = date ;
    }
    
}