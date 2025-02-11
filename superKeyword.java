/*  
     SUPER KEYWORD...............

       super keyword is used to  refer immediate parent class object 

       ..used to access  parents properties
       ..used to access parents functions
       ..used to access parents constructor
 */

public class superKeyword {
    public static void main(String args[]){
        Horse h = new Horse();
    }
    
}

class Animal{
    Animal(){
        System.out.println("Animal constructor is called");
    }
}

class Horse extends Animal{
    
    Horse(){
        super();// this will call the base class contructor
        System.out.println("Horse constructor is called");
    }
}
