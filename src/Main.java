import java.util.Scanner;

public class Main {
    static Scanner sc =  new Scanner(System.in);

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(12345678,
                "Akobir Toshtemirov", 2_000_000_000D);


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
                case "1" -> bankAccount.createAccount();
                case "2" -> bankAccount.accountInformation();
                case "3" -> bankAccount.depositMoney();
                case "4" -> bankAccount.withdrawMoney();
                case "5" -> {
                    System.out.println("Ok, task is done. Thanks for using our App!");
                    System.exit(0);
                }
                default -> System.out.println("Wrong option is selected! Try again!");
            }
        }


    }
}