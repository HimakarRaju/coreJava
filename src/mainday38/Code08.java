package mainday38;

/*
 * 
 * Given a string,return a string where for every char in the original,
 * there are two chars.?
 * 
 * doubleChar("The")?"TThhee"
 * doubleChar("AAbb")?"AAAAbbbb"
 * doubleChar("Hi-There")?"HHii--TThheerree"
 */

public class Code08 {
    public String doubleChar(String str) {
        String doubleChar = "";
        for (int i = 0; i < str.length(); i++) {
            doubleChar += str.charAt(i);
            doubleChar += str.charAt(i);
        }
        return doubleChar;
    }

    public static void main(String[] args) {
        Code08 c = new Code08();
        String s1 = c.doubleChar("The");
        String s2 = c.doubleChar("AAbb");
        String s3 = c.doubleChar("Hi-There");

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

    }
}

/*
 * Output
 * 
 * TThhee
 * AAAAbbbb
 * HHii--TThheerree
 */