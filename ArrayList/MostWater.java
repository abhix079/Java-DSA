import java.util.*;

public class MostWater {
    public static int bruteForceWater(ArrayList<Integer>heights){
        int maxWater= 0;
        for(int i=0;i<heights.size();i++){
            for(int j=i+1;j<heights.size();j++){
                int ht= Math.min(heights.get(i),heights.get(j));
                int width= j-i;
                int currWater= ht*width;
                maxWater= Math.max(maxWater,currWater);

            }
        }
        return maxWater;
    }

    // two pointer appraoch

    public static int optimisedWater(ArrayList<Integer>heights){
        int maxWater =0;
        int lp=0; //left pointer
        int rp = heights.size()-1;//right pointer
        while(lp<rp){
            int ht= Math.min(heights.get(lp),heights.get(rp));
            int width = rp-lp;
            int currWater = ht*width;
            maxWater = Math.max(currWater,maxWater);
            if(lp<rp){
                lp++;
            }
            else{
                rp--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        ArrayList<Integer>heights = new ArrayList<>();
        //1,8,6,2,5,4,8,3,7
        heights.add(1);
        heights.add(8);
        heights.add(6);
        heights.add(2);
        heights.add(5);
        heights.add(4);
        heights.add(8);
        heights.add(3);
        heights.add(7);
   System.out.println(bruteForceWater(heights));
   System.out.println(optimisedWater(heights));

    }
    
}
