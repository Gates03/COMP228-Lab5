public class DriverMain {
    public static void main(String[] args) {
        Bank obj = new Bank(500);

        // Create and start 4 withdrawals of $100
        for (int i = 1; i <= 4; i++) {
            ThreadWithdrawal t = new ThreadWithdrawal(obj, "Withdrawer-" + i, 100);
            t.start();
        }

        // Create and start 4 deposits of $50
        for (int i = 1; i <= 4; i++) {
            ThreadDeposit t = new ThreadDeposit(obj, "Depositor-" + i, 50);
            t.start();
        }
    }
}
