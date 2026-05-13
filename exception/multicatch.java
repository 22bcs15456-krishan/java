package exception;

public class multicatch {
    public static void main(String[] args) {
        try {
            int array[] = new int[5];
            array[10] = 45;
            int a = 10 / 0;
            System.out.println(a);
        } catch (ArithmeticException e) { // this is use for catch athmetic value
            System.out.println("cannot divide by zero");
        } catch (ArrayIndexOutOfBoundsException e) {// this is use for catch array index error
            System.out.println("array index is out of bound");
        }
        catch(Exception e){
            System.out.println("this is parent exception");
        }

    }

}
