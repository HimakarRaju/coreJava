package mainday30;

import java.util.Scanner;

/*
 * ask user how many numbers he wants to add
 * ask user to enter numbers
 * add numbers given
 */
public class Task2 {
    int i = 1;
    static Scanner sc = new Scanner(System.in);

    int userInput(int limit) {
        System.out.println("enter " + limit + " numbers");
        int sum = 0;
        while (i <= limit) {
            sum += sc.nextInt();
            i++;
        }
        return sum;
    }

    public static void main(String[] args) {
        Task2 tobj = new Task2();
        System.out.println("enter the max limit");
        int res = tobj.userInput(sc.nextInt());
        System.out.println(res);
    }
}

/*
 * enter the max limit
 * 5
 * enter 5 numbers
 * 1
 * 2
 * 3
 * 4
 * 5
 * 15
 */