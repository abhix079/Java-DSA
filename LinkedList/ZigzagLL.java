import java.util.*;

public class ZigzagLL {
    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<>();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        System.out.println("Original List: " + ll); 

        List<Integer> result = new ArrayList<>();
        int i = 0, j = ll.size() - 1;

        while (i <= j) {
            if (i == j) { // Handle middle element for odd-sized lists
                result.add(ll.get(i));
            } else {
                result.add(ll.get(i));
                result.add(ll.get(j));
            }
            i++;
            j--;
        }

        System.out.println("Zigzag Order: " + result);
    }
}
