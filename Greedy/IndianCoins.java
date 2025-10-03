import java.util.*;
public class IndianCoins {
    public static void main(String[] args) {
        int coins[] = {1,2,5,10,20,50,100,500,2000};
        int count=0;
        int amount = 121;
        ArrayList<Integer> res= new ArrayList<>();
        //ulta loop chalayenge, kyunki kosis krenge phle bda note de hm
        for(int i = coins.length-1;i>=0;i--){
            if(coins[i]<=amount){
                while(coins[i]<=amount){
                    count++;
                    res.add(coins[i]);
                    amount-=coins[i];

                }
            }
        }

       System.out.println("Number of coins: "+count); 
       for(int i =0;i<res.size();i++){
        System.out.print(res.get(i)+" ");
       }
    }
}
