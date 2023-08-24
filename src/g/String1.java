package g;

import java.util.Arrays;

public class String1 {
    public static void main(String[] args) {
        char a=97;
        char b='b';
        System.out.println(a);
        System.out.println(b);

        String str="patika.dev";
        System.out.println(str.charAt(2));
        System.out.println(str.codePointAt(1));
        System.out.println(str.codePointBefore(1));
        String str2="paTİka";
        System.out.println(str.compareTo(str2));
        System.out.println(str.compareToIgnoreCase(str2));
        System.out.println(str.concat(".dev"));
        System.out.println(str.contains("at"));
        System.out.println(str.endsWith("ka"));
        System.out.println(str.equals(str2));
        System.out.println(str.equalsIgnoreCase(str2));
        System.out.println(str.indexOf('a'));
        System.out.println(str.lastIndexOf('a'));
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        System.out.println(str.replace('a','b'));
        System.out.println(str.replaceFirst("a","b"));
        System.out.println(str.replaceAll("a","b"));

        String [] str3=str.split("a");
        System.out.println(Arrays.toString(str3));

        System.out.println(str.startsWith("pa"));
        System.out.println(str.substring(2,6));
        System.out.println(str2.toLowerCase());
        System.out.println(str2.toUpperCase());
        System.out.println(str.trim());
        System.out.println(str.valueOf("p"));
    }
}
