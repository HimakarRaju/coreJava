package mainday17;

public class ClassC {
    void meth1(int i) {
        if (i <= 10) {
            System.out.println("if block is executed");
        } else {
            System.out.println("else block is executed");
        }
    }

    void person(String s, int age) {
        if (age >= 18) {
            System.out.println(s + " is eligible to vote");
        } else {
            System.out.println(s + " you are not eligible to vote");
            System.out.println(s + " you will be eligible to vote after " + (age - 18) + "years");
        }
    }

    void examEligibility(int age) {
        if ((age >= 21) && (age <= 35)) {
            System.out.println("The person is eligible to write exam");
        } else {
            System.out.println("The person is not eligible to write exam");
        }
    }

    void isGameAvailable(String s) {
        if ((s == "available") || (s == "yes")) {
            System.out.println("The Game is available");
        } else {
            System.out.println("The game is not available");
        }
    }

    void Aada_varimatalaku_ardham1(String s) {
        if (!(s == "yes")) { // The user input is not case-sensitive"
            System.out.println("You can not");
        } else {
            System.out.println("You can play");
        }
    }

    void Aada_varimatalaku_ardham2(String s) {
        if (!(s.equals("Yes"))) { // As we used ".equals() the user input is case-sensitive"
            System.out.println("You can not");
        } else {
            System.out.println("You can play");
        }
    }

    public static void main(String[] args) {
        ClassC cobj = new ClassC();
        cobj.meth1(10);
        cobj.person("jagadheesh", 23);
        cobj.examEligibility(40);
        cobj.isGameAvailable("yes");
        cobj.Aada_varimatalaku_ardham1("Yes");// not case-sensitive
        cobj.Aada_varimatalaku_ardham2("Yes");// case-sensitive
    }
}
