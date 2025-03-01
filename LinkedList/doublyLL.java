public class doublyLL {

    public class  Node {
        int data;
        Node next;
        Node prev;
        public Node(int data){
            this.data= data;
            this.next=null;
            this.prev=null;
        }
    
        
    }
    public static Node head;
    public static Node tail;
    public static int size;

//add elemetn first

  public void addFirst(int data){
    Node newNode= new Node(data);
    size++;
    if(head==null){
        head= tail= newNode;
        return;

    }
    newNode.next=head;
    head.prev= newNode;
    head= newNode;
  }

 /// removeFirst
 /// 
  public int  removeFirst(){
    if(head== null){
        System.out.println("ddl is empty");
        return -1;

    }

    if(size==1){
         int val = head.data;
         head= null;
         tail=null;
         size--;
         return val;
    }

    int val= head.data;
    head= head.next;
    head.prev= null;
    size--;
    return val;
  }

  public void printBackward() {
    Node temp = tail;
    while (temp != null) {
        System.out.print(temp.data + " <-> ");
        temp = temp.prev;
    }
    System.out.println("NULL");
}


 //print

  public void print(){
    Node temp= head;
    while(temp!=null){
        System.out.print(temp.data+"<->");
        temp= temp.next;

    }
    System.out.println("null");
  }
    public static void main(String[] args) {
        doublyLL dll= new doublyLL();
        dll.addFirst(4);
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
 System.out.println(dll.size);
        dll.print();
        dll.removeFirst();
        dll.print();
        System.out.println(dll.size);
        dll.printBackward();
        


    }
    
}
