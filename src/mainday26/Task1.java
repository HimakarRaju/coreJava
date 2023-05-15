package mainday26;

public class Task1 {
    int input = 4;

    void meth1() {
        switch (input) {

            default:
                System.out.println(4);

            case 1:
                System.out.println(1);

            case 2:
                System.out.println(2);
                break;
        }
    }

    public static void main(String[] args) {
        new Task1().meth1();
    }
}

/*
 * OUTPUT
 * 
 * 4
 * 1
 * 2
 * 
 * 
 */
