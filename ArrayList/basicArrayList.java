import java.util.*;
//or 
// import java.util.ArrayList;
public class basicArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
         ArrayList<String> list2= new ArrayList<>();
         ArrayList<Boolean> list3= new ArrayList<>();


         //Add operation
         list.add(1);
         list.add(2);
         list.add(3);
         list.add(4);
         list.add(5);
         System.out.println(list);
        System.out.println(list.size());
         //get operation
         int element = list.get(2);
         System.out.println(element);

         //Delete operation

         list.remove(2);
         System.out.println(list);

         //set operation
         list.set(2,10);
         System.out.println(list);

         //containes operation
         System.out.println(list.contains(2));
         System.out.println(list.contains(11));

         
    
}
}
