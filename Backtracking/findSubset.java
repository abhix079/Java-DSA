public class findSubset {

    public static void findSubset(String str,String ans,int i){
        //Base case
   if(i==str.length()){
    if(ans.length()==0){
        System.out.println("Null");
    }
    else{
    System.out.println(ans);
    }
    return;
   }

        //Recursion step
        //if yes choice
        findSubset(str, ans+str.charAt(i), i+1);

        //if choice is no then
        findSubset(str, ans, i+1);

    }
    public static void main(String[] args) {
        String str= "abc";
        findSubset(str, "", 0);
    }
    
}
