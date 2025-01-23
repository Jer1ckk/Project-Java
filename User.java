public class User {

    int userID;
    String name;
    String dateOfBirth;
    String phoneNumbe;
    boolean isMale;
    String idCardNumber;

    User(String username , String dateOfBirth , String phoneNumber , int userID ,boolean isMale , String idCardNumber){
        name = username ;
        this.dateOfBirth = dateOfBirth ;
        this.phoneNumbe = phoneNumber ;
        this.userID = userID ;
        this.isMale = isMale ;
        this.idCardNumber = idCardNumber ;
    }
}