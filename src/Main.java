import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter your name,password and initial balance");
       Scanner sc = new Scanner(System.in);
       String name = sc.next();
       String password = sc.next();
       int balance = sc.nextInt();

       SBIAccount udayAcc = new SBIAccount(name,balance,password);
        System.out.println("Your account has been credited with account number: "+udayAcc.getAccountNo());
        //getbalance
        System.out.println("your current balance is :"+udayAcc.getBalance());
        //deposit money
        System.out.println(udayAcc.depositMoney(500));
        System.out.println("New balance is :"+udayAcc.getBalance());
        //withdraw
        System.out.println("Enter amount to be withdrawn:  ");
        int amount = sc.nextInt();
        System.out.println("Enter your password");
        String enteredpassword = sc.next();
        System.out.println(udayAcc.withdraw(amount,password));

        //interest
        System.out.println("Interest on current balance" +udayAcc.caluculateInterest(4));
    }
}