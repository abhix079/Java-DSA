public class friendPairing {
    public static int  friendPair(int n){
        if(n==1 || n==2){
            return n;
        }
        int single = friendPair(n-1); // 1 banda 
        int pair = (n-1)*friendPair(n-2);
        int ways = single+pair;
        return ways;
    }

    public static void main (String args[]){
        int n= 3;
        System.out.println(friendPair(n));


    }
    
}
