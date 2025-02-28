public class deleteNth {
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


    // delete nth from end

    public void deleteFromEnd(int n){
        //calculate size= 
        int sz=0;
         Node temp= head;
         while(temp!=null){
            temp= temp.next;
            sz++;
         }


         if(n==size){
            head= head.next;  //remove first
            return;

         }
         //sz-n
         int i=1;
         int iToFind= sz-n;
         Node prev= head;
         while(i<iToFind){
            prev= prev.next;
            i++;
         }
         prev.next= prev.next.next;
         return;
     
    }

    public static void main(String[] args) {
        deleteNth ll= new deleteNth();
        ll.print();
        ll.addLast(1);
        ll.print();
        
        ll.addLast(2);
        ll.print();
        ll.addLast(3);
        ll.print();

        ll.addLast(4);
        ll.print();
        ll.addLast(5);
        ll.print();
        ll.deleteFromEnd(3);
        ll.print();

        
       
        
    }
    



}

