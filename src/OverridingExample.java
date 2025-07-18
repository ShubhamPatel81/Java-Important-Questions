package src;
// Parent class
class Animal {
    void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Child class
class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("Dog barks!");
    }
}

// Main class
public class OverridingExample {
    public static void main(String[] args) {
        Animal myAnimal = new Animal();
        myAnimal.makeSound(); // Calls the parent class method

        Dog myDog = new Dog();
        myDog.makeSound(); // Calls the overridden method in the child class
    }
}
