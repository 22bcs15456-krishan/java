import java.util.*;

class accounts {

    int bal;

    accounts(int b) {
        bal = b;
    }

    synchronized boolean issufficientBal(int w) {
        return bal >= w;
    }

    synchronized void withdrawl(int w) {
        bal -= w;
        System.out.println(w + " withdrawal is successful");
        System.out.println("Transaction successful, balance = " + bal);
    }
}

// customer class
class customer implements Runnable {

    accounts x;
    String m;

    customer(accounts x, String m) {
        this.x = x;
        this.m = m;
    }

    public void run() {

        Scanner sc = new Scanner(System.in);

        synchronized (x) {

            System.out.println(m + " enter amount to withdrawl:");

            int amt = sc.nextInt();

            if (x.issufficientBal(amt)) {
                x.withdrawl(amt);
            } else {
                System.out.println("insufficient balance");
            }
        }
    }
}

// main class
public class accountsyn {

    public static void main(String[] args) {

        accounts a = new accounts(10000);

        customer c1 = new customer(a, "customer1");
        customer c2 = new customer(a, "customer2");

        Thread t1 = new Thread(c1);
        Thread t2 = new Thread(c2);

        t1.start();
        t2.start();
    }
}
