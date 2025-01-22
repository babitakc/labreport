class BankAccount {
    private int balance = 100;

    public synchronized void withdraw(int amount) {
        if (balance >= amount) {
            System.out.println(Thread.currentThread().getName() + " is withdrawing " + amount);
            balance -= amount;
            System.out
                    .println(Thread.currentThread().getName() + " completed withdrawal. Remaining balance: " + balance);
        } else {
            System.out.println(
                    Thread.currentThread().getName() + " tried to withdraw " + amount + " but insufficient funds.");
        }
    }
}

public class SyncExample {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();
        Runnable withdrawTask = () -> account.withdraw(70);
        Thread user1 = new Thread(withdrawTask, "User 1");
        Thread user2 = new Thread(withdrawTask, "User 2");
        user1.start();
        user2.start();
    }
}
