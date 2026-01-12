package OOPS;

public class multiLvelInheritance {
    public static void main(){
        Dog dog = new Dog();
        dog.eat();
        dog.legs = 4;
        System.out.println(dog.legs);
    }
    

}

//Base class
class Animal{
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void Breadth(){
        System.out.println("Breadthes");
    }
}

class Mammel extends Animal{
    int legs;
}

class Dog extends Mammel{
    String breed;
}