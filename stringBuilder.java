class stringBuilder{
    public static void main(String args[]){
        StringBuilder sb = new StringBuilder(""); // string builder is initialized empty

        for (char ch ='a';ch<='z';ch++){
            sb.append(ch);
        }
        System.out.println(sb);
    }
}