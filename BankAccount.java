public class BankAccount {
    
    private String owner;
    private Double balance;

    public BankAccount(String name, double Initialbalance){
        this.owner = name;
        this.balance = Initialbalance;
    }

    public void deposit(double amount){
        if (amount > 0){
            balance += amount;
        }
    }

    public void withdraw(double amount){
        if (balance > 0 && balance >= amount){
            balance -= amount;
        }
    }

    public void displayInfo(){
        System.out.printf("Name : %s | Balance: %.2f", owner, balance);
    }
}
