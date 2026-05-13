package exception;

public class trycatch {
public static void main(String[] args) {
    
    try{
        //Code that may produce an exception is written inside try block.

        int a=0;
    int b=0;
int c=a/b;
System.out.println(c);

}
catch(ArithmeticException e){                     //Catches the ArithmeticException.
    System.out.println("cannot divide by zero");
}
    
    }
}

    

