package src.ObjectOrientedConcept.Polymorphism;

public class OverriddingExample {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        Animal deer = new Herbivores();
        deer.eat();
        Animal tiger = new carnivores();
        tiger.eat();

    }
}

class Animal {
    void eat() {
        System.out.println("Animals Eat");
    }
}

class Herbivores extends Animal {
    void eat() {
        System.out.println("Herbivores eat plants..");
    }
}

class carnivores extends Animal {
    void eat() {
        System.out.println("Carnivores Eat meat..");
    }
}