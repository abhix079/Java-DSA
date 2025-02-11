/*   
     static keyword in java is used to share  the same variable  or method of a given class
     static mtlb aisa cheeze jo sbke liye same rahe

      hm log function ko,   properties ko 
 */

public class staticKeyword {

    public static void main(String args[]){
        // agr ek barr use property ka data declare kr denge to wo sb objec tke liye ho jayega
        Student s1 = new Student();
        s1.schoolName="Gurukul";
        System.out.println(s1.schoolName);

        Student s2 = new Student();
        System.out.println(s2.schoolName);
    
        Student s3= new Student();
        s3.schoolName="abc";  // ab sbhi object ke liye abc ho jayega

        System.out.println(s1.schoolName);
        System.out.println(s2.schoolName);
        System.out.println(s3.schoolName);


    }
    
}

class Student{
    String name;
    int roll;
 static String schoolName;

   void setName(String name){
        this.name= name;
    }

    String getName(){
        return this.name;
    }

}
