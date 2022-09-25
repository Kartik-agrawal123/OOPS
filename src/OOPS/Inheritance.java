package OOPS;
class Animal{
    /**public Animal(){
        System.out.println("Hi I am an animal class constructor");
    }
    public Animal(int a){
        System.out.println("Hi My size is :"+ a);
    }*/
    public void eat(){
        System.out.println("eating");
    }
    public void drink(){
        System.out.println("drinking");
    }
}
class Dog extends Animal{

     Dog(int a , int b){
        //super(a);
        System.out.println("Hi My size is :"+b);
    }

    public Dog() {

    }

    @Override
    public void eat(){
        System.out.println("eat");
    }
    public void bark(){
        System.out.println("bow bow");
    }
    public void bite(){
        System.out.println("aww aww");
    }
}

public class Inheritance {
    public static void main(String[] args) {
        //Animal a = new Animal();
        Dog d = new Dog(25,15);
        Animal ad = new Dog();
        //d.bark();
        //d.bite();
        //d.eat();
        //d.drink();
        d.eat();
    }
}
