

public class setBit {
    public static int setBit(int n, int i){
        int bitmask= 1<<i;
        return n |bitmask; 
    }
    
    public static void main(String ags[]){
        System.out.println(setBit(10, 2));
        System.out.println(setBit(10, 3));


    }
}

