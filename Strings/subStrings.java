public class subStrings {
    public static String subString(String str , int si, int ei){
        //si = start index
        //ei = end index
        String subStr= "";
        for (int i =si;i<ei;i++){
            subStr += str.charAt(i);

        }
        return subStr;
    }
    public static void main(String args[]){
        String str= "HelloWorld";

        System.out.println(subString(str,1,5));



    }
    
}
