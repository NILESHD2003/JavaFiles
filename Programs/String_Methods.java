package Programs;

public class String_Methods {
    public static void main(String[] args) {
        String S1="Hello",S2="hello";

        System.out.println(S1.charAt(3));

        System.out.println(S1.codePointAt(3));

        System.out.println(S1.codePointCount(0,4));

        System.out.println(S1.isEmpty());

        System.out.println(S1.length());

        System.out.println(S1.contains("H"));

        System.out.println(S1.toUpperCase());

        System.out.println(S1.toLowerCase());

        System.out.println(S1.equals(S2));

        System.out.println(S1.equalsIgnoreCase(S2));

        System.out.println(S1.startsWith("H"));
    }
}
