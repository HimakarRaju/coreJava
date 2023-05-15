package mainday25;
/*
 * Date : 19/04/2023
 * Assignment
 * 
 * Please change 
 * 
 * key[ 1-4 ] and 
 * course name["Core Java", "Advanced Java", "UI Technologies", "Oracle" ] 
 * 
 * in meth2() for validation;
 */

/*
 * write a switch case it should be having
 * minimum 4cases
 * 1st Case if statement
 * 2nd Case if - else
 * 3rd Case if - else -if
 * 4th Case Try to call a methods also
 */

public class Assign {

    void meth1(int key, String CourseCompleted) {
        switch (key) {

            case 1:
                if (CourseCompleted == "Core Java") {
                    System.out.println("You Completed Core Java");
                    System.out.println("Java Is Awesome. It can change your life");
                    System.out.println("Next you have to learn Advanced Java");
                    System.out.println(new Assign().meth4());

                }
                break;

            case 2:
                if (CourseCompleted == "Advanced Java") {
                    System.out.println("Learning Spring framework is good idea!");
                    System.out.println(new Assign().meth4());

                } else {
                    System.out.println("Try demo Classes to learn more on java and its frameworks");
                    System.out.println(new Assign().meth4());

                }
                break;

            case 3:
                if (CourseCompleted == "UI Technologies") {
                    System.out.println("Good luck for your future!" + "\n" + "as you can now apply for jobs trials");
                    System.out.println(new Assign().meth4());

                } else if (CourseCompleted == "Oracle") {
                    System.out.println(
                            "Good luck for your future!" + "\n" + "you can apply for jobs related to Databases");
                    System.out.println(new Assign().meth4());

                } else {
                    System.out.println("You'll learn more in coming months");
                    System.out.println(new Assign().meth4());

                }
                break;

            case (2 * 2):
                System.out.println("Case 4 executed");
                System.out.println(new Assign().meth4());
                break;

            default:
                System.out.println("Try Different key-value and Course");
                System.out.println(new Assign().meth4());
                break;
        }
    }

    void meth2() {
        System.out.println("meth2() Executed");
        new Assign().meth1(1, "Core Java");
    }

    void meth3() {
        System.out.println("Welcome to info point on Full Stack Java");
        System.out.println("meth3() executed");
        new Assign().meth2();
    }

    String meth4() {
        System.out.println("meth4() executed");
        String EndNote = "Thanks for reviewing the code!";
        return EndNote;
    }

    public static void main(String[] args) {
        new Assign().meth3();
    }
}

/*
 * 
 * OUTPUT
 * 
 * Welcome to info point on Full Stack Java
 * meth3() executed
 * meth2() Executed
 * You Completed Core Java
 * Java Is Awesome. It can change your life
 * Next you have to learn Advanced Java
 * meth4() executed
 * Thanks for reviewing the code!
 * 
 */
