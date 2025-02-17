public class printXpowN {
    public static int print(int x,int n){
        if(n==0){
            return 1;
        }
        else if(n==1){
            return x;
        }
        else{
            int res= x*print(x,n-1);
            return res;
        }

    }
    public static void main(String args[]){
        System.out.println(print(2, 3));

    }
    
}
