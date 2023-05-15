package mainday38;

public class Code03 {
    public void meth1(String word) {
        String s = "";
        for (int i = word.length() - 1; i >= 0; i--) {
            s = s + word.charAt(i);
        }
        System.out.println("word : " + word);
        System.out.println("s : " + s);

        if (word.equalsIgnoreCase(s)) {
            System.out.println(word + " is a palindrome");
        } else {
            System.out.println(word + " is not a palindrome");
        }
    }

    public static void main(String[] args) {
        Code03 c = new Code03();
        c.meth1("Madam");
        c.meth1("Kishan");
    }
}
