public class BankingAccount{
    /**
     * @param args
     */
    public int number;
    public double balance;

    Customer customer = new Customer();

    public BankingAccount(){     
    }

    public BankingAccount(int number, double balance){
        this.number = number;
        this.balance = balance;
    }
}
