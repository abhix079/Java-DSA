public class Constructor {
    public static void main (String args[]){
        Student s1 = new Student();
        Student s2 = new Student("ravi");
        Student s3 = new Student(25);
        System.out.println(s2.name);
        System.out.println(s3.age);

        Student s4= new Student("Ravi",20);
        System.out.println(s4.name+ " "+s4.age);
        
        



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
  

