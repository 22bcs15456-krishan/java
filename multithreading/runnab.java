/**package multithreading;

public class runnab {
    public static void main(String[] args) {
        Runnable r1 =new Runnable() {
            public void run() {
        
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 1: " + i);
            }
        }
        };

        Runnable r2 = new Runnable() {
            public void run(){
            for (int i = 0; i < 5; i++) {
                System.out.println("Thread 2: " + i);
            }
        }
        };

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
    
}**/
package multithreading;

// First Runnable class
class process implements Runnable {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("process no is: " + i);
        }
    }
}

// Second Runnable class
class process2 implements Runnable {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("process2 no is : " + i);
        }
    }
}

public class runnab {

    public static void main(String[] args) {

        process r1 = new process();
        process2 r2 = new process2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}
