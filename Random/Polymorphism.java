/*  POLYMORPHISM:   poly means many 
                    morphism means form
                    polymorphism means doing the same task in multiple forms


                    2 types of polymorphism :
                    -> COmpile time (jb compile time pr dikhe many forms) also called static polymorphism
                           -->method overloading
                    -> run time    (jb run time pr dikhe many forms)  also called dynamic polymorphism
                           --> method overriding

    
    ==>Method Overloading:
                 multiple function with same name but different parameters 

                 ya to parameter ka count alg ho ya datatype alg ho

                 sum(int a, int b) ----2 parameters
                 sum(float a, float b)  ----2 parameters but datatype is different
                 sum(int a, int b, int c)  --- same datatype but 3 parameters

 */


 /*
  Method overridng:.............................
  Parent and child class contains the same function  with different definition
 */

public class Polymorphism {
    
    public static void main(String args[]){
        Calculator c= new Calculator();
        System.out.println(c.sum(1, 2));
        System.out.println(c.sum((float)1.2,(float) 1.8)); // float isliye aage likhe hai kyunki java me jb number me dot lagate hai to wo usko double ki trh treat krta hai
        System.out.println(c.sum(1, 2, 3));

       Animal a = new Animal(); // agr base class ka object banayaenge to base class ka function call hoga
       a.eat();

       Deer d = new Deer();
       d.eat();//is baar deer class ka function call hoga



    }
}
class Calculator {
        int sum(int a, int b){
            return a+b;

        }
        float sum(float a, float b){
            return a+b;
        }
        int sum (int a, int b, int c){
            return a+b+c;
        }
}

class Animal{
    void eat(){
        System.out.println("Animal eats");

    }
}
class Deer extends Animal{
    void eat(){
        System.out.println("Deer eats");
    }
}

