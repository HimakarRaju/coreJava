package mainday26;

public class Task2 {
    void meth1(int a, int b, String c) {
        String operator = c;
        switch (operator) {
            case "+":
                System.out.println("The addition result: " + (a + b));
                break;
            case "-":
                System.out.println("The subtraction result: " + (a - b));
                break;
            case "/":
                System.out.println("The Division result:" + a / b);
                break;
            case "*":
                System.out.println("The multiplication result: " + a * b);
                break;
            default:
                System.out.println("Invalid Input");
                break;
        }
    }

    public static void main(String[] args) {
        new Task2().meth1(2, 4, "+");
    }
}

/*
 * OUTPUT
 * 
 * The addition result: 6
 */