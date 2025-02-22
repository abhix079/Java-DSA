public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        sb.append("world");
        System.out.println(sb);
        sb.setCharAt(5, 'W'); // used to replace or appned at specific loaction
        System.out.println(sb);
        sb.insert(0, 'y'); // insert at specific loaction and dont delte anything
        System.out.println(sb);

        sb.deleteCharAt(0);
        System.out.println(sb);
        sb.reverse();
        System.out.println(sb);
        sb.delete(0, 3);
        System.out.println(sb);


    }
    
}
