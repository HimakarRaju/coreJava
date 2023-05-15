package mainday24;

/*
 * A Company decided to give bonus of 5% to its employees if his/her year of service is more than 5 years.
 * Take a Parameterized method which takes users salary and years of service and 
 * print the bonus amount and updated salary
 */

public class Assign1 {
    void meth1(int salary, int YearsOfService) {
        int old_salary = salary;
        int bonus_amount = ((old_salary * 5) / 100);
        int new_salary = old_salary + bonus_amount;

        if (YearsOfService > 5) {
            System.out.println("You get a bonus of 5%");
            System.out.println("The bonus is " + bonus_amount);
            System.out.println("Your Salary is " + new_salary);
        } else {
            System.out.println(
                    "Thank you for your service" + "\n" + "But you need " + (5 - YearsOfService)
                            + " of service to get bonus");
            System.out.println("Your Salary is " + old_salary);
        }

    }

    public static void main(String[] args) {

        new Assign1().meth1(30000, 6);
    }
}
/*
 * OUTPUT
 * 
 * new Assign1().meth1(30000, 6);
 * You get a bonus of 5%
 * The bonus is 1500
 * Your Salary is 31500
 * 
 */