import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

public class BankAccount {
    static final Scanner sc = new Scanner(System.in);
//    static Locale locale = new Locale("en", "USA");
//    static final NumberFormat nf =NumberFormat.getNumberInstance(locale);
    static final DecimalFormat df =new DecimalFormat("$##0.000#");

    private String accountNumber;
    private String accountHolderName;
    private double accountBalance;


    public String getAccountNumber() {
        return accountNumber;
    }
    public void setAccountNumber(String accountNumber){
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

    public BankAccount(String accountNumber, String accontHolderName, double accountBalance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accontHolderName;
        this.accountBalance = accountBalance;
    }

    public void accountInformation() {
        System.out.println();
        System.out.println("*******************");
        System.out.println("Account information:");
        if(accountHolderName == null)
            System.out.println("You did not create Bank account yet. Choose first (1) option to create an account!");
        else {
            System.out.println("Account number: " + accountNumber);
            System.out.println("Account Holder Name: " + accountHolderName);
            System.out.println("Account Balance: " + df.format(accountBalance));
        }
        System.out.println("*******************");
        System.out.println();
    }

    public void depositMoney() {
        System.out.print("Enter the amount of money that you want to deposit: ");
        double deposit = sc.nextDouble();

        accountBalance += deposit;

        System.out.println("You deposited " + df.format(deposit) + " amount of money!");
        System.out.println("Now you account balance: " + df.format(accountBalance));
    }

    public void withdrawMoney() {
        System.out.print("Enter the amount of money that you want to withdraw: ");
        double moneyWithdraw = sc.nextDouble();

        if(accountBalance - moneyWithdraw < 0)
            System.out.println("The amount of money you withdrawing is too much. Please enter the correct amount of money!");
        else {
            accountBalance -= moneyWithdraw;
            System.out.println("You withdrew " + df.format(moneyWithdraw) + " amount of money!");
            System.out.println("Now your account balance is: " + df.format(accountBalance));
        }
    }

}
