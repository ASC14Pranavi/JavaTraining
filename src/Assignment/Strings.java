package Assignment;

public class Strings {
    public static void main(String[] args) {
        String str = "Hi, Welcome to Ascendion ";
        String str1 = "Hello World";
        System.out.println(str.charAt(5));
        System.out.println(str.contains("two"));
        System.out.println(str.length());
        System.out.println(str.indexOf('H'));
        System.out.println(str.equals(str1));
        System.out.println(str.equalsIgnoreCase(str1));
        System.out.println(String.join("-", "hyd", "vskp"));
        System.out.println(str.toUpperCase());
        System.out.println(str1.toLowerCase());
        System.out.println(str.trim());
        System.out.println(str.lastIndexOf('e'));
    }
}
