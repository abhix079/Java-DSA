public class addLast {
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

  public void addLast(int data){
    //step 1;

    Node newNode = new Node(data);

    if(head==null){
        head=tail=newNode;
        return;
    }

    //step2; 
    tail.next= newNode;

    //step 3;
    tail= newNode;

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
        addLast ll = new addLast();
ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();



    }
    
}
