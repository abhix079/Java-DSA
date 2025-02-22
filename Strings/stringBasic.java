import java.util.*;

public class stringBasic {

    public static void printLetters(String str){
        for (int i =0;i<str.length();i++){
            System.out.println(str.charAt(i));
        }
    }
    public static void main(String args[]){
        char arr[]={'a','b','c','d'};  //array of character datatype to store characters

        String str = "abcd"; // sting to store characters

        String str2 = new String("abcd"); // other way to declare string

        Scanner sc = new Scanner(System.in);
        String name;
       // name = sc.next();// this will only take only word as input 

       name = sc.nextLine();// this will take all the sentence given in input
        System.out.println(name);
        sc.close();


        // STRINGS ARE IMMUTABLE .... ISKA MTLB HM KUCH BHI CHANGE NHI KR SKTE


        String fullname = "Tony Stark";
        System.out.println(fullname.length());   //   .length()  method is used to get the length of the string  //  space bhi count hota hai

        // concatenation

        String firstName =  "abhishek";
        String lastName = "prajapati";
        String fullNam = firstName+ " "+ lastName;
        System.out.println(fullNam); 
        System.out.println(fullNam.charAt(2));
        printLetters(firstName);


        String s1= "Tony";
        String s2= "Tony";
        String s3= new String("Tony");
        if(s1==s2){
            System.out.println("Equal hai");
        }
        else{
            System.out.println("Not Equal");

        }
        if(s1==s3){
            System.out.println("Equal hai");  // this will result not equal
        }
        else{
            System.out.println("Not Equal");

        }
        
        if(s1.equals(s3)){
            System.out.println("Both are equal"); // kyunki .equals characters ke basis pr comparison krta hai
        }

    }

    
}
