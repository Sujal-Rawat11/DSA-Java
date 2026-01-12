package OOPS;

public class Hybrid_inheritance {
    public static void main(String[] args) {

        shark s = new shark();
        s.eat();
        s.swim();
        s.hunt();

        cat c = new cat();
        c.eat();
        c.walk();
        c.meow();

        dog d = new dog();
        d.eat();
        d.walk();
        d.barks();

        Bird b = new Bird();
        b.eat();
        b.fly();
    }
}

// Base class
class Animal {
    String color;

    void eat() {
        System.out.println("Eats");
    }

    void breathe() {
        System.out.println("Breathes");
    }
}

class fish extends Animal {
    void swim() {
        System.out.println("Swim");
    }
}

class shark extends fish {
    void hunt() {
        System.out.println("Hunt");
    }
}

class bird extends Animal {
    void fly() {
        System.out.println("fly");
    }
}

class mammal extends Animal {
    void walk() {
        System.out.println("Walk");
    }
}

class cat extends mammal {
    void meow() {
        System.out.println("Meow");
    }
}

class dog extends mammal {
    void barks() {
        System.out.println("Bark ");
    }
}