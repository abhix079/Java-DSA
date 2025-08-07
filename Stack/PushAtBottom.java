import java.util.*;

public class PushAtBottom {
    // Recursively push an element at the bottom of the stack
    public static void pushBottom(Stack<Integer> s, int data) {
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        int top = s.pop();
        pushBottom(s, data); // recursive call
        s.push(top); // push back the popped element
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();

        s.push(1);
        s.push(2);
        s.push(3);

        pushBottom(s, 4); // pushes 4 at the bottom of the stack

        // Print stack contents after pushing at bottom
        while (!s.isEmpty()) {
            System.out.println(s.pop());
        }
    }
}
