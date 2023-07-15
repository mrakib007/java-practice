package stringsPractice;

public class StringBuilderJava {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Tony");
        System.out.println(sb);

        // char at a given index
        System.out.println(sb.charAt(2));

        // set char at a given index
        sb.setCharAt(2, 'P');
        System.out.println(sb);

        // insert a char in the given index
        sb.insert(0, 'S');
        System.out.println(sb);

        // delete a char 
        sb.delete(2,3);
        System.out.println(sb);

        // append characters
        sb.append(" Stark");
        System.out.println(sb);

        // length of a string
        System.out.println(sb.length());
    }
}
