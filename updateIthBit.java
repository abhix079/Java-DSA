

public class updateIthBit {
    public static int setBit(int n, int i){
        int bitmask= 1<<i;
        return n |bitmask; 
    }
    public static int clearBit(int n, int i){
        int bitmask= ~(1<<i);
        return n & bitmask; 
    }
    public static int updateBit(int n, int i, int newBit){
        if (newBit==0){
            return clearBit(n, i);
        }
        else{
            return setBit(n, i);
        }
    }
    public static void main (String args[]){

        System.out.println(updateBit(10, 2, 1));
    }
    
}
