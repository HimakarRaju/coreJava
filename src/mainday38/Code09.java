package mainday38;

/*
 * 
 * Given a string, return true if the first 2 chars in the string also appear at the end of the string, 
 * such as with "edited".
 * 
 * frontAgain("edited") ? true
 * frontAgain("edit") ? false
 * frontAgain("ed") ? true
 */

public class Code09 {
    public boolean frontAgain(String str) {
        int len = str.length();
        if (len >= 2)
            return str.substring(0, 2).equals(str.substring(len - 2, len));
        else
            return false;
    }

    public static void main(String[] args) {
        Code09 c = new Code09();
        System.out.println(c.frontAgain("edited"));
        System.out.println(c.frontAgain("edit"));
        System.out.println(c.frontAgain("ed"));
    }
}

/*
 * Output
 * 
 * true
 * false
 * true
 * 
 */