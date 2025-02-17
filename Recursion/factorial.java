public class factorial {
    public static int fact(int n){
        if(n==0 || n==1){
            return 1;

        }
    
     else{
        int fact = n*fact(n-1);
        return fact; 

     }
    }


    public static void main(String args[]){
        int n=5;
        System.out.println(fact(n));


    }
    
}
