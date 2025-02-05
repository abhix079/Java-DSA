public class compareString {
    public static void main(String args[]){
        String fruits[] ={"mango","banana","apple"};
        String largest= fruits[0];
        for(int i =0;i<fruits.length;i++){
            if(largest.compareTo(fruits[i])<0){
                largest= fruits[i];
            }
        }
        System.out.println(largest);   //str1.compareTo(str2)
                                        // it returns  0 if equal
                                        // it returns <0   which means  st1<st2
                                        // if returns >0 it means st1>st2
    }
    
}
