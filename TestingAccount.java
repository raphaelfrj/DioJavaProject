public class TestingAccount {


    public static void main(String[] args) {
        BankingAccount checkingAccount = new BankingAccount();
        BankingAccount savingsAccount = new BankingAccount();
        BankingAccount investmentAccount = new BankingAccount();
        
        checkingAccount.number = 88;
        checkingAccount.balance = 244.21;
        checkingAccount.customer.name = "Raphael";
        checkingAccount.customer.age = 29;

        savingsAccount.number = 89;
        savingsAccount.balance = 12000;

        investmentAccount.number = 90;
        investmentAccount.balance = 55000;

        System.out.println("Hello " + checkingAccount.customer.name + ", follow your account information:");
        System.out.println("Your Checking Account balance is $" + checkingAccount.balance);
        System.out.println("Your Savings Account balance is $" + savingsAccount.balance);
        System.out.println("Your Investment Account balance is $" + investmentAccount.balance);
  


    }
}