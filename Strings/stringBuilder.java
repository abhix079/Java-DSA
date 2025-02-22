class stringBuilder{
    public static void main(String args[]){
        String str= "Abhishek";
        StringBuilder sb = new StringBuilder(str); 

        sb.append("world");
        System.out.println(sb);
        sb.setCharAt(2,'I');
        System.out.println(sb);
        sb.insert(0,"hello"); // used to insert word
        sb.insert(2,'R');
        System.out.println(sb);
        sb.deleteCharAt(2);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 2);
        System.out.println(sb);



    }
}