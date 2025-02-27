import java.util.*;

public class MaximumElement {
    public static void main(String[] args) {
        int max = Integer.MIN_VALUE;
        ArrayList<Integer>list = new ArrayList<>();
        list.add(2);
        list.add(5);
        list.add(9);
        list.add(3);

        for(int i=0;i<list.size();i++){
           max= Math.max(max,list.get(i));
        }
        System.out.println(max);
    }
    
}
