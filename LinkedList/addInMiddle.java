public class addInMiddle {
    public  static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data= data;
            this.next=null;
        }
    }
    public Node head;
    public Node tail;
    public static int size;


    public void addLast(int data){
        //step 1;
    
        Node newNode = new Node(data);
        size++;
    
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



    public void addElInMid(int index,int data){
       

        if(index==0){
            addLast(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i=0;
        while(i<index-1){
            temp= temp.next;
            i++;
        }

        newNode.next= temp.next;
        temp.next= newNode;

    }

    public static void main(String[] args) {
        addInMiddle ll= new addInMiddle();
        ll.print();
        ll.addLast(3);
        ll.print();
        ll.addLast(4);
        ll.print();
        ll.addElInMid(1, 5);

        ll.print();
        
    }
    
}
