public class addFirst {
    public static class Node{
        int data;
        Node next;
         
        public Node(int data){
            this.data = data;
            this.next= null;
        }
    }
    public Node head;
    public Node tail;

    //Mthod to add;

    public void addFirstElement(int data){
        Node newNode= new Node(data);

           //step1    create new node

        if(head ==null){
            head=tail = newNode;
            return;     
            
            
        }
        
        
        
         //step 2 new node's next = head

         newNode.next= head; // this is linking step

         //step 3  head = new node
         head= new Node(data);
    }

    public void print(){
        if(head==null){
            System.out.println("Linkedlist is null");
            return;
        }
        Node temp =head;
        while(temp!=null){
           System.out.print(temp.data+"->");
           temp =temp.next;   
        }
        System.out.println("null");
    
    }

    
    public static void main(String[] args) {
        addFirst ll = new addFirst();
ll.print();
        ll.addFirstElement(2);
        ll.print();
        ll.addFirstElement(1);
        ll.print();

    }
    
}
