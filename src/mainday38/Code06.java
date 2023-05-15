package mainday38;

/*
 * Given a string, return the string made of its first two chars, 
 * so the String "Hello" yields "He".
 * If the string is shorter than length 2, 
 * return whatever there is, so "X" yields "X",
 * and the empty string "" yields the empty string "".
 * Note that str.length() returns the length of a string.
 */

public class Code06 {
    public String firstTwo(String str) {
        if (str.length() >= 3)
            return str.substring(0, 2);
        return str;
    }

    public static void main(String[] args) {
        Code06 c = new Code06();
        System.out.println(c.firstTwo("Hello"));
        System.out.println(c.firstTwo("abcdefg"));
        System.out.println(c.firstTwo("ab"));
    }
}

/*
 * Output
 * 
 * He
 * ab
 * ab
 */