public class binaryStringProblem {

    public static void printString(int n , int lastPlace,String str){

        //base case
        if(n==0){
            System.out.println(str);
            return;
        }

        //kaam
        printString(n-1, 0, str+="0");
        if(lastPlace==1){
            printString(n-1, 1, str+="1");


        }


    }

    public static void main(String args[]){
        int n =3;
        printString(n, 0, "");

    }
    
}
