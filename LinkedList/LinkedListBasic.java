public class LinkedListBasic {

    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next= null;
        }

    }
    public static Node head;
    public static Node tail;

    // methods
    
    public static void main(String[] args) {
        LinkedListBasic ll = new LinkedListBasic();
        ll.head= new Node(1);
        ll.head.next= new Node(2);

        
    }
    
}
