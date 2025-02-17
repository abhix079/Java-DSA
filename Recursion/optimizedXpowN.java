public class optimizedXpowN {
    public static int optimizedSolutionForXpowN(int x, int n){
        if(n==0){
            return 1;
        }
        int optimized= optimizedSolutionForXpowN(x, n/2)*optimizedSolutionForXpowN(x, n/2);
        if(n%2!=0){
            return x*optimized;
        }
        return optimized;
    }

    public static void main (String args[]){
        System.out.println(optimizedSolutionForXpowN(2, 10));
    
    }
    
}
