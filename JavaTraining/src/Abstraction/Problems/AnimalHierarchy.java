package Abstraction.Problems;

abstract class Animal {
    String name;
    int age;

    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    abstract String makeSound();

    public void displayAnimalInfo() {
        System.out.println(name + " - Sound: " + makeSound());
    }
}

class Lion extends Animal {
    Lion(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
       return "Roar";
    }
}

class Elephant extends Animal {
    Elephant(String name, int age) {
        super(name, age);
    }

    @Override
    String makeSound() {
        return "Trumpet";
    }
}

public class AnimalHierarchy {
    public static void main(String[] args) {
        Lion lion = new Lion("Simba", 5);
        Elephant elephant = new Elephant("Dumbo", 10);

        lion.displayAnimalInfo();
        elephant.displayAnimalInfo();
    }
}

