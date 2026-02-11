public class interf {

    interface Drawable {
        void draw();// this is onle rule of interface tha is all bloow are use for following the
                    // rule of interface we have to use this method in all class which is implement
                    // this interface
    }

    static class Circle implements Drawable {
        public void draw() {
            System.out.println("Drawing a Circle");// this is implemantation of rules
        }
    }

    static class square implements Drawable {
        public void draw() {
            System.out.println("Drawing a Square");// this is implemantation of rules
        }

        // public void area(int a) {
        // int area = a*a;
        // System.out.println("Drawing a Square with area "+area);
        // }
    }

    public static void main(String[] args) {
        Drawable d1 = new Circle();
        square d2 = new square();

        d1.draw();
        d2.draw();
        // d2.area(5);
    }
}
