public class fibonacci {
    public static int fib(int n){
        if (n==0){
            return 0;

        }
        else if(n==1 ){
            return 1;
        }
        else{
            int fib= fib(n-1)+fib(n-2);
            return fib;
        }
    }
    public static void main(String args[]){
        int n =10;
        for(int i=0;i<n;i++){
            System.err.print(fib(i)+ " ");
        }
    }
    
}
