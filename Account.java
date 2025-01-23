public class Account {

    String name;
    String dateOfBirth;
    String phoneNumbe;
    int accountID;
    String idCardNumber;
    double balnace;
    int securityNumber ;

    Account(String userName ,String idCardNumber , int userID , int securityNumber  ){
        name = userName ;
        accountID = userID ;
        this.idCardNumber = idCardNumber;
        this.securityNumber = securityNumber;
    }
}