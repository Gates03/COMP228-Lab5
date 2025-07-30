public class Bank {
    private int balance;

    public Bank(int initialBalance) {
        this.balance = initialBalance;
    }

    // synchronized withdrawal
    public synchronized void withdraw(String name, int amount) {
        if (balance >= amount) {
            System.out.println(name + " is withdrawing $" + amount);
            balance -= amount;
            System.out.println("Balance after withdrawal: $" + balance);
        } else {
            System.out.println(name + " tried to withdraw $" + amount + " but insufficient funds.");
        }
    }

    // synchronized deposit
    public synchronized void deposit(String name, int amount) {
        System.out.println(name + " is depositing $" + amount);
        balance += amount;
        System.out.println("Balance after deposit: $" + balance);
    }

    public int getBalance() {
        return balance;
    }
}