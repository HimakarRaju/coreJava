package mainday32;

public class Code1 {
    int x = 10;
    static int y = 20;

    void meth1() {
        int x = 100;
        int y = 200;

        System.out.println("-----Local Variables------");
        System.out.println(x);
        System.out.println(y);

        System.out.println("-----Global Variables------");
        System.out.println("Instance Variable : " + this.x);
        System.out.println("Static Variable : " + Code1.y + "\n");

        System.out.println("Static Variable : " + Code1.y); // changed this.y to Code1.y

    }

    public static void main(String[] args) {
        new Code1().meth1();
    }
}

/*
 * OUTPUT
 * 
 * Instance Variable : 10Static Variable : 20
 * 
 * Static Variable : 20
 * 
 */