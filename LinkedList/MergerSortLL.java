public class MergerSortLL {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public void addFirstElement(int data) {
        Node newNode = new Node(data);

        // Step 1: Create new node
        if (head == null) {
            head = tail = newNode;
            return;
        }

        // Step 2: new node's next = head
        newNode.next = head; // Linking step

        // Step 3: head = newNode
        head = newNode;
    }

    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1); // Dummy node
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data < head2.data) {
                temp.next = head1;
                head1 = head1.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
            }
            temp = temp.next;
        }

        // Append remaining elements
        if (head1 != null) temp.next = head1;
        if (head2 != null) temp.next = head2;

        return mergedLL.next;
    }

    public Node mergerSort(Node head) {
        if (head == null || head.next == null) { // Fixed condition
            return head;
        }

        // Find mid
        Node mid = getMid(head);

        // Split into two halves
        Node rightHead = mid.next;
        mid.next = null;

        // Recursive merge sort
        Node newLeft = mergerSort(head);
        Node newRight = mergerSort(rightHead);

        // Merge sorted halves
        return merge(newLeft, newRight);
    }

    public static void main(String[] args) {
        MergerSortLL ll = new MergerSortLL();
        ll.addFirstElement(1);
        ll.addFirstElement(2);
        ll.addFirstElement(3);
        ll.addFirstElement(4);
        ll.addFirstElement(5);

        // 5->4->3->2->1
        ll.print();
        ll.head = ll.mergerSort(ll.head);
        ll.print();
    }
}
