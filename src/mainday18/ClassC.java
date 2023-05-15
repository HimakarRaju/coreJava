package mainday18;

public class ClassC {
    final static int x;
    static {
        System.out.println("1st static block");
        x = 50;
    }

    public static void main(String[] args) {
        System.out.println("Java is awesome");
        System.out.println("x : " + x);
    }

    static {
        System.out.println("2nd static block");
        System.out.println("x : " + x);
    }
}

/*
 * 
 * OUTPUT
 * 
 * 1st static block
 * 2nd static block
 * x : 50
 * Java is awesome
 * x : 50
 */