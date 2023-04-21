public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double accountBalance;


    public int getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(int accountNumber){
        this.accountNumber = accountNumber;
    }


    public String getAccountHolderName() {
        return accountHolderName;
    }
    public void setAccountHolderName(String accountHolderName) {
        this.accountHolderName = accountHolderName;
    }


    public double getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }


    public BankAccount(int accountNumber, String accontHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accontHolderName;
        this.accountBalance = accountBalance;
    }

    public void createAccount(){}

    public void accountInformation() {
        System.out.println();
        System.out.println("*******************");
        System.out.println("Account information:");
        System.out.println("Account number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Account Balance: $" + accountBalance);
        System.out.println("*******************");
        System.out.println();
    }

    public void depositMoney() {}

    public void withdrawMoney() {}

}
