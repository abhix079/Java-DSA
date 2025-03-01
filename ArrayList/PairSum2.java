import java.util.*;
public class PairSum2 {
    public static boolean twoPointer(ArrayList<Integer>list,int target){
        int breakingPoint =-1;
        for(int i=0;i<list.size();i++){
            if(list.get(i)>list.get(i+1)){
                breakingPoint=i;
                break;
            }
        }
        int lp= breakingPoint+ 1;
        int rp = breakingPoint;

        while (lp!=rp) {
            int sum = list.get(lp)+list.get(rp);
            if(sum==target){
                return true;
            }
            else if(sum<target){
                lp=(lp+1)%list.size();
            }
            else{
                rp=(list.size()+rp-1)%list.size();
            }
            
        }

return false;

    }
    public static void main(String[] args) {
        ArrayList<Integer>list = new ArrayList<>();

        //11,15,6,8,9,10
        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

  int target =16;

  System.out.println(twoPointer(list, target));
    }
    
}
