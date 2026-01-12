package OOPS;

public class inheritance {
    public static void main(String args[]){
        Fish tuna = new Fish();  
        tuna.eat();
        tuna.swim();
    }
  
}

//Base Class
class Animal {
    String color;
    void eat(){
        System.out.println("Eats");
    }

    void breathe(){
        System.out.println("Breathes");
    }
}


//Derieved Class
class Fish extends Animal{
    int fins;

    void swim(){
        System.out.println("Swims in water");
    }
}