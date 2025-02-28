public class searchInLL {
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

///searching in ll 
             public int searchEl(int key){
                Node temp = head;
                int i=0;
                while(temp!=null){
                    if(temp.data==key){
                        return i;
                    }
                    temp= temp.next;
                    i++;
                }
                return -1;
             }

             // rec search

             public int helperFun(Node head,int key){
                if(head==null)
                   {
                       return -1;
                   
                   }

                    if(head.data==key){
                        return 0;

                    }
                    int idx= helperFun(head.next, key);
                    if(idx==-1){
                        return -1;

                    }
                    return idx+1;
             }
             public int recSearch(int key){
                return helperFun(head,key);
             }
    // reverse

    public void reverseLL(){
        Node prev=  null;
        Node curr= head;
        Node next=null;

        while(curr!=null){
            next= curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;

        }
        head = prev;
    }

    public static void main(String[] args) {
        searchInLL ll= new searchInLL();
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

        System.out.println(ll.searchEl(3));
        System.out.println(ll.searchEl(4));
        System.out.print(ll.recSearch(3));
        System.out.print(ll.recSearch(4));
        System.out.println();
      ll.reverseLL();
      ll.print();
        
       
        
    }
    



}
