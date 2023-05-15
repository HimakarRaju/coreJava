package mainday24;

/*
 * 
 * A Student will not be allowed to sit in exam if his/her attendancePercentage is less than 75%.
 * Take a parameterized method which takes
 * ==> Number of classes held
 * ==> Number of classes attended.
 * And print percentage of classes attended
 * If student is allowed to sit in exam or not.
 * 
 */

public class Assign2 {
    void meth1(int classes, int attendance) {

        int attendancePercentage = (classes * attendance) / 100;

        if (attendancePercentage < 75) {
            System.out.println("You are not eligible to sit for exam");
        } else if (attendancePercentage >= 75) {
            System.out.println("You are eligible to sit for exam");
        }
    }

    public static void main(String[] args) {
        new Assign2().meth1(100, 100);
    }
}


/*
 * OUTPUT
 * 
 * new Assign2().meth1(100, 100);
 * You are eligible to sit for exam
 */