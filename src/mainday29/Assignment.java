package mainday29;

import java.util.Scanner;

/*
 * 
 * 
 * Ask user to enter 
 * 
 * =>empName
 * =>empId
 * =>empSal
 * =>empDept
 * =>empAddress
 * 
 * Print as
 * =>Employee Name :
 * =>Employee Id : 
 * =>Employee Sal :
 * =>Employee Dept :
 * =>Employee Address :
 * 
 * 
 */
public class Assignment {
    Scanner sc = new Scanner(System.in);

    void meth1() {
        System.out.println("Please enter employee Name");
        String empName = sc.nextLine();

        System.out.println("Please enter employee ID");
        int empId = sc.nextInt();

        System.out.println("Please enter employee Salary");
        int empSal = sc.nextInt();

        System.out.println("Please enter employee Department");
        sc.nextLine();
        String empDept = sc.nextLine();

        System.out.println("Please enter employee Address");
        sc.nextLine();
        String empAddress = sc.nextLine();

        System.out.println("The details given by user are as follows : " + "\n");

        System.out.println("======================================================");
        System.out.println(" ||  " + "   Employee Name          : " + empName + "              ");
        System.out.println(" ||  " + "   Employee Id            : " + empId + "                ");
        System.out.println(" ||  " + "   Employee Salary        : " + empSal + "               ");
        System.out.println(" ||  " + "   Employee Department    : " + empDept + "              ");
        System.out.println(" ||  " + "   Employee Address       : " + empAddress + "           ");
        System.out.println("===========================================================");

    }

    public static void main(String[] args) {
        new Assignment().meth1();
    }
}
