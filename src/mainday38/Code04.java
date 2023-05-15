package mainday38;

/*
 * Given an "out" string length 4, such as "<<>>", 
 * and a word return a new string where 
 * the word is in the middle of the out string, e.g. "<<word>>"
 */

public class Code04 {

    public String makeOutWord(String out, String word) {
        return (out.substring(0, 2) + word + out.substring(2, 4));
    }

    public static void main(String[] args) {
        Code04 code4 = new Code04();

        System.out.println(code4.makeOutWord("<<>>", "Yay"));

        System.out.println(code4.makeOutWord("<<>>", "WooHoo"));

        System.out.println(code4.makeOutWord("[[]]", "word"));

    }
}

/*
 * Output
 * 
 * <<Yay>>
 * <<WooHoo>>
 * [[word]]
 * 
 */