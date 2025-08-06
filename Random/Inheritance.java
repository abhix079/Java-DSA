public class Inheritance {
    public static void main(String args[]){

        Dog d = new Dog();
        d.eat();
        d.sleep();
        d.bark();
    }
}

// Base class

class Animal{
    String color;
    void eat(){
        System.out.println("It can eats");

    }
    void sleep(){
        System.out.println("It can sleep");

    }

}

//Derived class // subclass


class Dog extends Animal{
    void bark(){

        System.out.println("It can bark");
    }
}



/*Types of Inheritance

1.. Single color inheritance
2.. multilevel inheritance ....ek base class se dusara classs aur us class se derived classs
3.. Hierarchial Inheritance .....isme ek base class hota hai aur multiple derived class
4.. Hybrid inheitance
 java me multiple inheritance nhi hota hai but c++ me hota hai

*/