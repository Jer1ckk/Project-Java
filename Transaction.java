public class Transaction {
    int transactionID;
    String transactionDate;
    double amount;
    String transactionType; // Deposit or Withdrawal
    String remarks;
    int accountID; // Relationship with Account

    public Transaction(int transactionID, String transactionDate, double amount, String transactionType, String remarks, int accountID) {
        this.transactionID = transactionID;
        this.transactionDate = transactionDate;
        this.amount = amount;
        this.transactionType = transactionType;
        this.remarks = remarks;
        this.accountID = accountID;
    }
}