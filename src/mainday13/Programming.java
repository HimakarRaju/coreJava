package mainday13;

public class Programming {
    public Programming() {
        System.out.println("I love programming languages");
    }

    public Programming(String s) {
        System.out.println("I love " + s);
    }

    public static void main(String[] args) {
        new Programming();
        new Programming("Java");
    }
}
