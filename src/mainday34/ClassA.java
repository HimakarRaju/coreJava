package mainday34;

import java.util.Arrays;
import java.util.Scanner;

public class ClassA {
    Scanner sc = new Scanner(System.in);

    void meth1() {
        System.out.println("Implementing Java Array\n");

        boolean arr1[] = new boolean[3];
        String arr2[] = new String[4];
        int arr3[] = new int[5];

        System.out.println("arr1[3] : " + arr1[arr1.length - 1]);
        System.out.println("arr1 : " + Arrays.toString(arr2) + "\n");

        /*
         * // Passing values into array
         * 
         * arr2[0] = "Java";
         * arr2[1] = "HTML";
         * arr2[2] = "CSS";
         * arr2[3] = "Oracle";
         * 
         */

        System.out.println("Please enter " + arr2.length + " string values");

        for (int i = 0; i <= arr2.length - 1; i++) {
            arr2[i] = sc.next();
        }

        System.out.println("arr2 : " + Arrays.toString(arr2) + "\n");

        arr3[0] = 100;
        arr3[2] = 300;
        arr3[4] = 500;
        // 500,0,300,0,100

    }

    void movieTickets() {
        System.out.println("Which movie you want to see?");
        String mName = sc.next();
        System.out.println(mName);

        System.out.println("How many tickets you need?");
        int tickets = sc.nextInt();

        String names[] = new String[tickets];
        System.out.println("please enter " + names.length + " your names");

        for (int i = 0; i < names.length; i++) {
            names[i] = sc.next();
        }

        System.out.println("Your tickets has been booked for ");
        for (String val : names) {
            System.out.println(val);
        }
    }

    public static void main(String[] args) {
        ClassA aobj = new ClassA();
        // aobj.meth1();
        aobj.movieTickets();
    }
}
