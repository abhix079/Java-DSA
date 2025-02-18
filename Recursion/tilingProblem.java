public class tilingProblem {
    public static int tile(int n){    //2xn is size of floor

  if(n==0 || n==1){
    return 1;
  }

        //Vertical choice
        int verticalTile =tile(n-1);
        int horizontalTile= tile(n-2);

        int totalWays = verticalTile +horizontalTile;
        return totalWays;
    }
       

    public static void main (String args[]){
        System.out.println(tile(4));

    }
    
}
