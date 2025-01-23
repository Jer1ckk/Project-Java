public class Project {

    public static void main(String[] args) {
        
        Account p = new Account("vin" , "123" ,001 , 123456);
        System.out.println(p.balnace);
        Withdraw bmw = new Withdraw(001 , 20.02 , "23-01-2025");
        System.out.println(bmw.accountID);
        Transfer t = new Transfer (001, 002, 25, "222222");
        System.out.println("acc: " + t.fromAccountID + " transfer to acc "+t.toAccountID+ " amount: " + t.amount);


    }
}