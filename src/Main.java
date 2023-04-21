import java.util.Scanner;

public class Main {
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount(0,
                null, 0);

        System.out.println("Welcome to Bank Account Management App!");

        while(true){
            System.out.println("""
                1. Create a Bank Account.
                2. View an account information.
                3. Deposit Money.
                4. Withdraw Money.
                5. Exit the program""");
            System.out.print("Choose an option from the list above: ");
            String option = sc.nextLine();

            switch (option){
                case "1" -> Main.createAccount(bankAccount);
                case "2" -> {
                    System.out.println();
                    if(bankAccount.getAccountHolderName() == null) System.out.println("Enter or create bank account first!");
                    else bankAccount.accountInformation();
                    System.out.println();
                }
                case "3" -> {
                    System.out.println();
                    if(bankAccount.getAccountHolderName() == null) System.out.println("Enter or create bank account first!");
                    else bankAccount.depositMoney();
                    System.out.println();
                }
                case "4" -> {
                    System.out.println();
                    if(bankAccount.getAccountHolderName() == null) System.out.println("Enter or create bank account first!");
                    else bankAccount.withdrawMoney();
                    System.out.println();
                }
                case "5" -> {
                    System.out.println();
                    System.out.println("Ok, task is done. Thanks for using our App!");
                    System.exit(0);
                    System.out.println();
                }
                default -> {
                    System.out.println();
                    System.out.println("Wrong option is selected! Try again!");
                    System.out.println();
                }
            }
        }
    }

    public static void createAccount(BankAccount bankAccount) {
        System.out.print("Enter account number: ");
        int accountNumber = sc.nextInt();

        sc.nextLine();

        System.out.print("Enter account holder name: ");
        String accountHolderName = sc.nextLine();

        System.out.print("Enter account balance: ");
        double accountBalance = sc.nextDouble();

        bankAccount.setAccountNumber(accountNumber);
        bankAccount.setAccountHolderName(accountHolderName);
        bankAccount.setAccountBalance(accountBalance);
    }
}