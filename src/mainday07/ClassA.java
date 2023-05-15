package mainday07;

// public class ClassA {

//     void meth1() {
//         int a = 10;
//         System.out.println(a);
//     }
//     public static void main(String[] args) {
//         ClassA aobj = new ClassA();
//         aobj.meth1();
//     }
// }

// public class ClassA {
//     //int byte = 10; // error as it is a keyword.
//     //int Byte = 20;
//     //int String = 30;

// }

// public class ClassA{

//     //int studentRollNumber = 101; cannot use this name as it starts with number

//     // int StudentRollNumber = 101; valid naming convention

//     // int Student5554684Number = 101; valid naming convention

//     // int Student RollNumber = 101; IN-valid naming convention

//     // int StudentaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaRollNumber = 101; valid naming convention any length is okay

// }

// public class ClassA {
//     void meth1() {
//         System.out.println("hi");
//     }
//     public static void main(String[] args) {
//         ClassA aobj = new ClassA();
//         aobj.meth1();
//     }
// }

// public class ClassA {
//     void meth1() {

//     }
// }

public class ClassA {
    void meth1() {
        int a = 10;
        int A = 20;
        // output
        System.out.println("a : " + a); // a : 10
        System.out.println("A : " + A); // A : 20
        System.out.println('a' + a); // 97 + 10 = 107
        System.out.println('A' + a); // 65 + 10 = 75
        System.out.println('a' + A); // 97 + 20 = 117

        /*
         * ASCII value of (Uppercase A) = 65
         * ASCII value of (Lowercase a) = 97
         */

        System.out.println("value :" + a + A); // value :1020
        System.out.println("data :" + (a + a) + A); // data :2020
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        aobj.meth1();
    }
}
