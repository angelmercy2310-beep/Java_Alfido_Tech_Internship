// OOPDemo.java

// Base class (Parent)
class Animal {
    String name;

    // Constructor
    Animal(String name) {
        this.name = name;
    }

    // Method to be overridden
    void sound() {
        System.out.println("This animal makes a sound.");
    }

    // Method to display name
    void display() {
        System.out.println("Animal Name: " + name);
    }
}

// Derived class (Child) - Inherits from Animal
class Dog extends Animal {

    // Constructor
    Dog(String name) {
        super(name); // Call parent constructor
    }

    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println(name + " says: Woof Woof!");
    }
}

// Another Derived class
class Cat extends Animal {

    // Constructor
    Cat(String name) {
        super(name);
    }

    // Overriding the sound() method
    @Override
    void sound() {
        System.out.println(name + " says: Meow Meow!");
    }
}

// Main class
public class OOPDemo {
    public static void main(String[] args) {
        // Create objects of parent and child classes
        Animal genericAnimal = new Animal("Some Animal");
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Call methods
        genericAnimal.display();
        genericAnimal.sound();

        dog.display();
        dog.sound();

        cat.display();
        cat.sound();
    }
}
