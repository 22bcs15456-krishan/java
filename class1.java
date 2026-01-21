public class class1 {
    // instance member functions (non-static)

  
void fun1() {
        System.out.println("fun1");
    }

    void fun2() {
        System.out.println("fun2");
    }
    static void fun3(){
        System.out.println("fun3");

    }
}
class object1 { 
    public static void main(String[] args) {

        // Creating object of class1
        class1 obj = new class1();

        // Calling instance methods
        obj.fun1();
        obj.fun2();
        class1.fun3();
    }
}

