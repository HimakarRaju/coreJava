package mainday24;

//WAP take values of length and breadth of a rectangle from parameterized method and check if it is square or not

public class ClassC {
    void checkIfSquare(int a, int b) {
        if (a == b) {
            System.out.println("It is Square");
        } else {
            System.out.println("It is Rectangle");
        }

    }

    public static void main(String[] args) {
        new ClassC().checkIfSquare(5, 50);
    }
}

/*
 * OUTPUT
 * 
 * It is Rectangle
 * 
 */