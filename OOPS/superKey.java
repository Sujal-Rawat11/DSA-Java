package OOPS;

public class superKey {
    public static void main(String args[]){
        Horse h = new Horse();
        
    }
}


class Animal{
    String color;
    Animal(){
        System.out.println("Animal constructor is called ");
    }
}


class Horse extends Animal{

    Horse(){
        super(); 
        super.color = "brown";
        System.out.println("Horse Constructor is called ");
    }
}