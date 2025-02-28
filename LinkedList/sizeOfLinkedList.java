public class sizeOfLinkedList {
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


        public  int removeFirst(){
            if (size==0){
                System.out.println("ll is empty");
                return -1;
            }
            else if(size==-1){
                int val=head.data;
                head=tail=null;
                return val;
            }
            int val= head.data;
            head= head.next;
            size--; 
            return val;
            
        }


        public int removeLast(){
            if(size==0){
                System.out.println("ll is empty");
                return -1;
            }
            else if(size==1){
                int val = head.data;
                head=tail=null;
                size=0;
                return val;

            }
            Node prev  = head;
            for(int i=0;i<size-2;i++){
                prev= prev.next;


            }
            int val= prev.next.data;
            prev.next=null;
            tail= prev;
            size--;
            return val;

        }
    
        public static void main(String[] args) {
            sizeOfLinkedList ll= new sizeOfLinkedList();
            ll.print();
            ll.addLast(1);
            ll.print();
            
            ll.addLast(2);
            ll.print();
            ll.addLast(3);
            ll.print();

            ll.addLast(4);
            ll.print();
            ll.addElInMid(1, 5);
            ll.print();
            System.out.println(ll.size);
            System.out.println("removed: "+ll.removeFirst());
            ll.print();
            
            System.out.println("removed last: "+ll.removeLast());
            ll.print();
            
           
            
        }
        
    
    
    
}
