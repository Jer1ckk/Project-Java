public class Account {

    String name;
    String dateOfBirth;
    String phoneNumbe;
    boolean isMale;
    int accountID;
    String idCardNumber;
    double balnace;
    int securityNumber ;

    public Account(String userName ,String dateOfBirth,String idCardNumber,boolean isMale , int securityNumber  ){
        name = userName ;
        this.idCardNumber = idCardNumber;
        this.dateOfBirth = dateOfBirth ;
        this.isMale = isMale ;
        this.securityNumber = securityNumber;
    }
//     Account(String username , String dateOfBirth , String phoneNumber , int accountID ,boolean isMale, double balance , int securityNumber ){
//         name = username ;
//         this.dateOfBirth = dateOfBirth ;
//         this.phoneNumbe = phoneNumber ;
//         this.accountID = accountID ;
//         this.isMale = isMale ;
//         this.balnace = balance ;
//         this.securityNumber = securityNumber ;
//     }
}