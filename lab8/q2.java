class Animal {
    void makeSound() {
        System.out.println("The animal makes a sound.");
    }
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

class Cat extends Dog {
    @Override
    void makeSound() {
        System.out.println("The cat meows.");
    }
}

public class q2 {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();

        genericAnimal.makeSound();
        dog.makeSound();
        cat.makeSound();
    }
}
