import java.util.*;

public class MultiDimensionalArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> mainList = new ArrayList<>();
        ArrayList<Integer>list= new ArrayList<>();
        list.add(1);list.add(2);list.add(3);

        mainList.add(list); //add the list to mainlist
         

        ArrayList<Integer>list2 = new ArrayList<>();
        list2.add(2);list2.add(4);list2.add(6);

        mainList.add(list2);
        
        //fetching data

        for (int i=0;i<mainList.size();i++){
            ArrayList<Integer>currList = mainList.get(i);
            for(int j=0;j<currList.size();j++){
                System.out.print(currList.get(j)+" ");
            }
            System.out.println();
        }
        System.out.println(mainList);
    }
    
}
