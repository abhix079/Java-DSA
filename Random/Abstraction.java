/*
 *    Hiding uneccesary detail and showing only the important part to the user
 * 
 *   ABSTRACT CLASS...........
 * use the abstract keyword
 * 
 *       => cannot create instance of  the abstract class
 *       => can have abstract/non-abstract method
 *       =>can have constructor
 */


 /* agr base or child class me constructor hai to phle base class ka constructor call hoga uske baad child ...

 animal construcot callled
 horse construcotr called
 chicken constructor called
  * 

  */
public class Abstraction {
    public static void main(String args[]){
        // Animal a  = new Animal();    abstract classs ka instance (object) nhi ban payega, error de dega

        Horse h = new Horse();
        h.eat();
        h.walk();
        System.out.println(h.color); //hmesa parent ka constructor call hoga
       

        Chicken c= new Chicken();
        c.eat();
        c.walk();

 

    }
    
}

abstract class Animal{
    String color;
    Animal(){
        color="brown";
    }
    void eat(){
        System.out.println("animal eats");
    }

    abstract void walk();   /// walk depend krega derived class pr , agr horse hua to uske hisaab se and agr chicken hua to  uske hisaab se
}

class Horse extends Animal{
    void changeColor(){
        color="Black";
    }
    void walk(){
        System.out.println("walks on 4 leg");
    }
}

class Chicken extends Animal{
    void changeColor(){
        color="yellow";
    }
    void walk(){
        System.out.println("walks on 2 leg");
    }
}



