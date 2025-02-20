
import java.util.*;
public class takingInput {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String str= sc.next(); //THis will only take the one word not the whole sentence written on the console
        System.out.println(str);
       
        String s = sc.nextLine(); /// this will read all the data that are writtne by the user on the console
        System.out.println(s);
sc.close();
    }
    
}
