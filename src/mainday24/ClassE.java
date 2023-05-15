package mainday24;

public class ClassE {
    void grading(int a) {
        if (a < 25) {
            System.out.println("F Grade");
        } else if (a >= 25 & a < 45) {
            System.out.println("E Grade");
        } else if (a >= 45 & a < 50) {
            System.out.println("D Grade");
        } else if (a >= 50 & a < 60) {
            System.out.println("C Grade");
        } else if (a >= 60 & a < 80) {
            System.out.println("B Grade");
        } else if (a > 80) {
            System.out.println("A Grade");
        }
    }

    public static void main(String[] args) {
        new ClassE().grading(88);
    }
}

/*
 * OUTPUT
 * 
 * A Grade
 */