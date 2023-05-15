package mainday38;

/*
 * Given a string of even length, 
 * return the first half. So the string "WooHoo" yields "Woo".
 * 
 * firstHalf("WooHoo") ? "Woo"
 * firstHalf("HelloThere") ? "Hello"
 * firstHalf("abcdef") ? "abc"
 * 
 */

public class Code07 {
    public String firstHalf(String str) {
        return str.substring(0, str.length() / 2);
    }

    public static void main(String[] args) {
        Code07 c = new Code07();
        String s1 = c.firstHalf("WooHoo");
        String s2 = c.firstHalf("HelloThere");
        String s3 = c.firstHalf("abcdef");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }
}

/*
 * Output
 * 
 * Woo
 * Hello
 * abc
 */