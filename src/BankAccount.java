public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private float accountBalance;


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


    public float getAccountBalance() {
        return accountBalance;
    }
    public void setAccountBalance(float accountBalance) {
        this.accountBalance = accountBalance;
    }


    public BankAccount(int accountNumber, String accontHolderName, float accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accontHolderName;
        this.accountBalance = accountBalance;
    }

    public void createAccount(){}

    public void accountInformation() {}

    public void depositMoney() {}

    public void withdrawMoney() {}

}
