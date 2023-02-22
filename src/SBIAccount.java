import java.util.UUID;

public class SBIAccount implements BankInterface{
    private String name;
    private String accountNo;
    private int balance;
    private String password;
    private double rateOfInterest;

    public SBIAccount(String name, int balance, String password) {
        this.name = name;
        this.balance = balance;
        this.password = password;
        this.rateOfInterest = 6.6;
        this.accountNo = String.valueOf(UUID.randomUUID());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(String accountNo) {
        this.accountNo = accountNo;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getRateOfInterest() {
        return rateOfInterest;
    }

    public void setRateOfInterest(double rateOfInterest) {
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public int getBalance() {
        return this.balance;
    }

    @Override
    public String depositMoney(int amount) {
        this.balance += amount;
        return "your account has been credited by" +amount ;
    }

    @Override
    public String withdraw(int amount,String enteredpassword) {
        if(enteredpassword.equals(this.password)){
          if(balance<amount){
              return "insufficent balance";
          }
          else{
              balance-= amount;
              return "money deducted";
          }
        }
       else{
           return "you entered wrong password";
        }
    }

    @Override
    public double caluculateInterest(int time) {
        return (balance*rateOfInterest*time)/100.0;
    }
}
