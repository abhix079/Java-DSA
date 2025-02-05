

public class getBit {
    public static int getBit(int n, int i){
        int bitmask= 1<<i;
        if ((n& bitmask)==0){
            return 0;

        }
        else {
            return 1;
        }
    }
    public static void main(String ags[]){
        System.out.println(getBit(10, 2));
        System.out.println(getBit(10, 3));


    }
    
}
