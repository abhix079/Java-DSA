

public class oddEven {
    public static void oddOrEven(int n){
        int bitmask= 1;  // 1 ko hmlog bitmask  bolte hai kyunki usi ke saath hm log check krenge

        if((n & bitmask)==0){
            System.out.println("Even number");
        }
        else{
            System.out.println("Odd number");
        }

    }
    public static void main(String args[]){
        int num = 4;
        int num2 = 5;
        oddOrEven(num);
        oddOrEven(num2);

    }
}
