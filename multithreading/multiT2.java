package multithreading;//old way of coding because thsi is not allow to extend more than one class 
//but in this we can extend more than one class because we are using runnable interface and we can implement more than one interface but we can not extend more than one class but in runnable you extend more than one one class


// First Runnable class
class process extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("process no is: " + i);
        }
    }
}

// Second Runnable class
class process2 extends Thread {

    public void run() {
        for (int i = 0; i < 20; i++) {
            System.out.println("process2 no is : " + i);
        }
    }
}

public class multiT2 {

    public static void main(String[] args) {

        process r1 = new process();
        process2 r2 = new process2();

        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(r2);

        t1.start();
        t2.start();
    }
}

