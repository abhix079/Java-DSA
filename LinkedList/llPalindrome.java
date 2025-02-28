import java.util.*;
public class llPalindrome {
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


    // check palindrome

    public boolean checkPalindrome(){
        ArrayList<Integer> list= new ArrayList<>();
        Node temp =head;


        //store linked list in arraylst

        while(temp!=null){
            list.add(temp.data);
            temp= temp.next;

        }
        //using two pointer appreach

        int lp=0, rp= list.size()-1;
        while(lp<rp){
            if(!list.get(lp).equals(list.get(rp))){
                return false;//not palindrome
            }
            lp++;
            rp--;
        }
        return true;
    }

    public static void main(String[] args) {
        llPalindrome ll= new llPalindrome();
        ll.print();
        ll.addLast(1);
        ll.print();
        
        ll.addLast(2);
        ll.print();
        ll.addLast(3);
        ll.print();

        ll.addLast(2);
        ll.print();
        ll.addLast(2);
        ll.print();

        if(ll.checkPalindrome()){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not palindrome");
        }
       

        
       
        
    }
    



}

