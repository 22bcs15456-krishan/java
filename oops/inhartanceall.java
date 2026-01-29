
package oops;

public class inhartanceall {

    // Parent class
    class Trait {
        String colour;
        int height;
        int weight;
        int age;
    }

    // Single inheritance
    class Dog extends Trait {
        String breed;
    }

    // Multilevel inheritance
    class Ray extends Dog {
        String type;
    }

    class Cat extends Ray {
        String kind;
    }

    // Hierarchical inheritance
    class Lion extends Trait {
        String strength;
    }

    // Main method
    public static void main(String[] args) {

        inhartanceall obj = new inhartanceall();

        Cat c = obj.new Cat();
        c.colour = "White";
        c.breed = "Persian";

        System.out.println("Cat Colour: " + c.colour);
        System.out.println("Cat Breed: " + c.breed);

        Lion l = obj.new Lion();
        l.colour = "Golden";
        l.strength = "Very Strong";

        System.out.println("Lion Colour: " + l.colour);
        System.out.println("Lion Strength: " + l.strength);
    }
}
