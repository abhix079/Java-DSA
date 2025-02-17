public class decreasingOrder{
    public static void printNumberDecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.println(n+ " ");
        printNumberDecreasing(n-1);
        
    }
    public static void main(String args[]){
        int n=10;
        printNumberDecreasing(n);
 
    }
} 