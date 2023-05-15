package Assignment;

import java.util.Scanner;

public class Assignment {
    Scanner sc = new Scanner(System.in);
    int key = sc.nextInt();

    Assignment() {
        switch (key) {
            case 1:
                System.out.println("you have chosen to see expenses" + "\n");
                expenses();
                break;
            case 2:
                System.out.println("You have chosen to see daily logs" + "\n");
                logs();
                break;
            default:
                System.out.println("Sorry cannot understand your choice" + "\n" + "Please select again.");
        }
    }

    void expenses() {
        System.out.println("Rs. " + 5500 + " " + "Used for Hostel Fee");
        System.out.println("Rs. " + 300 + " " + "Used for Food and Beverages");
        System.out.println("Rs. " + 500 + " " + "Used for Utilities");
        System.out.println("Rs. " + 200 + " " + "Used for Travel");
        System.out.println("Rs. " + 500 + " " + "Used for Clothing");
        System.out.println("Rs. " + 700 + " " + "Used for Accessories");
    }

    void logs() {
        System.out.println("1. Getting up at morning 5.30 AM");
        System.out.println("2. Attending to Core Java class at morning 7.15 AM");
        System.out.println("3. Eating breakfast at 9.00 AM");
        System.out.println("4. Attending Oracle Class at 9.15 AM");
        System.out.println("5. Attending UI class at 11.00 AM");
        System.out.println("6. Coming to hostel & having lunch by 1.00 PM");
        System.out.println("7. Practising All that is learnt on in the day");
        System.out.println("8. Repeating The whole process another day");
    }

    public static void main(String[] args) {
        System.out.println("Please select a choice : " + "\n");
        System.out.println("Choose (1) for seeing expenses");
        System.out.println("Choose (2) for seeing daily logs" + "\n");
        System.out.println("Enter your choice : ");
        new Assignment();
    }
}
