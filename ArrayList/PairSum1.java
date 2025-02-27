import java.util.*;
public class PairSum1 {
    public static boolean bruteForce(ArrayList<Integer>list,int target){
        for(int i=0;i<list.size();i++){
            for(int j=i+1;j<list.size();j++){
                if(list.get(i)+list.get(j)==target){
                    return true;
                }
            }
        }
        return false;
    }

    //optimized approach
    public static boolean twoPointer(ArrayList<Integer>list,int target){
        int lp= 0;
        int rp= list.size()-1;
        while(lp<rp){
            int sum = list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            else if (sum<target){
                lp++;
        }
        else{
            rp--;
        }
        }
return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        //1,2,3,4,5,6
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 5;
        System.out.println(bruteForce(list, target));
        System.out.println(twoPointer(list, target));


    }
    
}
