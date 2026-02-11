public class polimor {

    static class numeric {
        void num(int a) {
            System.out.println("The number is: " + a);
        }

        void add(int a, int b) {
            System.out.println("The sum is: " + (a + b));
        }
    }

    public static void main(String[] args) {
        numeric n = new numeric();
        n.num(5);
        n.add(10, 20);
    }
}
