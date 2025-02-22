public class palindrome {
    public static void main(String[] args) {
        String str= "madam";
        StringBuilder sb = new StringBuilder(str);

        String gt=sb.reverse()+"";
        if (str.equals(sb)){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("NOt");
        }
    }
    
}
