import java.util.*;

public class SortInArrayList {
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(1);
        list.add(9);
        list.add(7);
        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);
        Collections.sort(list,Collections.reverseOrder());
        System.out.println(list);
    }
    
}
 