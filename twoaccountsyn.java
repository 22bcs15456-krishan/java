// Bank Account class
class BankAccount {

    private int balance;

    // constructor
    BankAccount(int balance) {
        this.balance = balance;
    }

    // synchronized withdrawal
    synchronized void withdraw(String user, int amount) {

        System.out.println(user + " trying to withdraw " + amount);

        if (balance >= amount) {

            System.out.println(user + " withdrawal approved");

            balance -= amount;

            System.out.println("Remaining balance = " + balance);

        } else {
            System.out.println(user + " insufficient balance");
        }
    }
}

// User class (Thread task)
class User implements Runnable {

    BankAccount account;
    String name;
    int amount;

    User(BankAccount account, String name, int amount) {
        this.account = account;
        this.name = name;
        this.amount = amount;
    }

    public void run() {

        // shared account access
        account.withdraw(name, amount);
    }
}

// Main class
public class twoaccountsyn {

    public static void main(String[] args) {

        // SAME account shared by multiple users
        BankAccount account = new BankAccount(10000);

        User u1 = new User(account, "User1", 7000);
        User u2 = new User(account, "User2", 6000);

        Thread t1 = new Thread(u1);
        Thread t2 = new Thread(u2);

        t1.start();
        t2.start();
    }
}
