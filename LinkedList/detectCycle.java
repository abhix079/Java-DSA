public class detectCycle {
    public static class Node{
        int data;
        Node next;
        public Node(int data){
            this.data= data;
            this.next= null;

        }

    }

    public static  Node head;
    public static  Node tail;

    public void print(){
        if(head==null){
            System.out.println("Linkedlist is empty");
            return;
        }
       Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // public void addEle(int data){
    //     Node newNode= new Node(data);
    //     if(head==null){
    //         head=tail=newNode;
    //         return;
    //     }
    //     tail.next= newNode;
    //     tail= newNode;

    // }

    public static boolean isCycle(){
        Node slow = head;
        Node fast= head;
        while(fast!=null && fast.next!=null){
            slow= slow.next;
            fast= fast.next.next;
            if(slow==fast){  // cycle present
                return true;
            }
        }
        return false; //cycle doesnot exist

    }

    public static void removeCycle(){
        //detect cycle
        Node slow= head;
        Node fast = head;
        boolean cycle= false;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast= fast.next.next;

            if(fast==slow){
                cycle= true;
                break;
            }
        }
        if(cycle==false){
            return;
        }
        //find meeting point
        slow = head;
        Node prev = null;
        while(slow!= fast){
            prev = fast;
            slow=slow.next;
            fast= fast.next;

        }
        //remove cycle
        prev.next= null;
    }

    public static void main(String[] args) {
       head = new Node(1);
       Node temp= new Node(2);
       head.next= temp;
       head.next.next= new Node(3);
       head.next.next.next= temp;
       //1-2-3-1

       System.out.println(isCycle());

       removeCycle();
       System.out.println(isCycle());
       
        
        
    }
    
}
