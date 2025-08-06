public class Constructor {
    public static void main (String args[]){
        Student s1 = new Student();
        Student s2 = new Student("ravi");
        Student s3 = new Student(25);
        System.out.println(s2.name);
        System.out.println(s3.age);

        Student s4= new Student("Ravi",20);
        System.out.println(s4.name+ " "+s4.age);
        
        Person p1 = new Person();
        p1.name= "Abhishek";
        p1.age= 20;


        Person p2= new Person(p1);
System.out.println(p2.name);
System.out.println(p2.age);



    }
    
}
class Student{
    String name;
    int age;

    Student(){
        System.out.println("Constructor is called.."); // constructor is called when the object is created
    }

    Student(String name){  // this is called parametrized constructor
        this.name= name;
    }
    Student(int age){
        this.age= age;
    }
    Student(String name, int age){
        this.name= name;
        this.age= age;
    }

}

// default constructor is called as non -parametrized constructor
  

// copy constructor is by- default in c++ , but in java we have to create it manually

// in copy constructor, ek object ki saari properties to dusare object me copy kr dena


class Person {
    String name;
    int age;


    Person(Person p1){  // this is copy consstructor
        this.name= p1.name;
        this.age= p1.age;
    }
    Person(){
        System.out.println("Constructor is called..");
    }
    Person(String name){
        this.name= name;
    }
    Person(int age){
        this.age= age;
    }
}
  //Shallow and Deep copy

  // in shallow copy changes reflect
  // in deep copy changes don't reflect 

  //..............DESTRUCTOR.........

  // we dont  have destructor in java , it is only available in cpp, it is a special function that destruct or delete the  object from the memory which are not used from long time in program;

  // in java , garbage collector does this task , it automatically delete the object from the memeory which are no longer usefull in the code

  // it scans the whole code and remove the unwanted or unused objects
  