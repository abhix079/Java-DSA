public class sumOfNatural {

    public static int sumOfNaturalNo(int n){
        if(n==1){
            return 1;
        }
        else{
            int sum=n+sumOfNaturalNo(n-1);
            return sum;
        }
    }

    public static void main(String args[]){
        int n=5;
        System.out.println(sumOfNaturalNo(n));


    }
    
}
