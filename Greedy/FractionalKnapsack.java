import java.util.*;

public class FractionalKnapsack {
    public static void main(String[] args) {
        int val[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int w = 50;

        double ratio[][] = new double[val.length][2];// array banaye 2 colum ka,
        // 1st colum me index dalenge aur 2nd column me ration

        for (int i = 0; i < val.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = val[i] / (double) weight[i];

        }
        // now shorting the ratio array in ascending order and then ulta loop chla denge
        // to phle largest ration wala element milega

        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1])); // this is called lamda function


 int capacity = w;
 int finalAns= 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int idx= (int)ratio[i][0];
            if(capacity>=weight[idx]){
                finalAns+=val[idx];
                capacity-=weight[idx];
            }
            else{
                finalAns+=(ratio[i][1]*capacity);
                capacity=0;
                break;
            }

        }
       System.out.println(finalAns);

    }

}
