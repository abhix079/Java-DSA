

public class clearBit {
    public static int clearBit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask; 
    }
    public static void main(String args[]){
        System.out.println(clearBit(10, 2));
        System.out.println(clearBit(10, 1));
    }
    
}
