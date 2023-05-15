package mainday38;

/*
 * Given a string,
 * return a new string made of 3 copies 
 * of the last 2 chars of the original string.
 * The string length will be at least 2.
 */

public class Code05 {
    public String extraEnd(String str) {
        int len = str.length();
        String temp = str.substring(len - 2, len);
        return (temp + temp + temp);
    }

    public static void main(String[] args) {
        Code05 c = new Code05();
        String s1 = c.extraEnd("Hello");
        String s2 = c.extraEnd("ab");
        String s3 = c.extraEnd("Hi");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

/*
 * Output
 * 
 * lololo
 * ababab
 * HiHiHi
 */