
  // Given a route containing four directions North, East, West , South , find the shortest path to reach destination  "WNEENESENNN"

public class shortestPath {

    public static float findPath(String str){
        int x= 0;
        int y=0; //' yinitially at center'  

        //if it  move in North then  y+1
        // south  = y-1
        // east = x+1
        // west = x-1
        // after this apply distance formula

        for (int i =0;i<str.length();i++){
            if(str.charAt(i)=='N'){
                y=y+1;
            }
            else if(str.charAt(i)=='S'){
                y=y-1;
            }
            else if(str.charAt(i)=='E'){
                x= x+1;

            }
            else {
                x=x-1;
            }
        }

       int X1= x*x;
    int X2 = y*y;
    return (float)Math.sqrt(X2+X1);
    }
    public static void main(String args[]){
        String str= "WNEENESENNN";
        float ans=findPath(str);
        System.out.println(ans);
        

    }
    
    
}
