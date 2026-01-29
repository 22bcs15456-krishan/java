package oops;

import java.util.Scanner;

public class constructor1 {

    int x, y;

    // Parameterized constructor
    constructor1(int p, int q) {
        x = p;
        y = q;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter x: ");
        int p = sc.nextInt();

        System.out.print("Enter y: ");
        int q = sc.nextInt();

        constructor1 c = new constructor1(p, q);

        System.out.println(c.x);
        System.out.println(c.y);

        sc.close();
    }
}
