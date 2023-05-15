package mainday40;

import java.util.Scanner;

public class Task1b {
    Scanner sc = new Scanner(System.in);
    Task1a tobj = new Task1a();

    void meth1() {

        System.out.println("Enter Employee name : ");
        tobj.setEmpName(sc.next());

        System.out.println("Enter Employee salary : ");
        tobj.setEmpSalary(sc.nextInt());

        System.out.println("Enter Employee Experience");
        tobj.setEmpExp(sc.nextInt());

        System.out.println("Employee Name : " + tobj.getEmpName());
        System.out.println("Employee Salary : " + tobj.getEmpSalary());
        System.out.println("Employee Experience : " + tobj.getEmpExp());

        System.out.println("Final Salary : " + tobj.finalSalary());

    }

    public static void main(String[] args) {
        Task1b tobj = new Task1b();
        tobj.meth1();
    }
}

/*
 * 
 * -----Experience <= 5 years-------
 * 
 * Enter Employee name :
 * Himakar
 * Enter Employee salary :
 * 25000
 * Enter Employee Experience
 * 5
 * Employee Name : Himakar
 * Employee Salary : 25000
 * Employee Experience : 5
 * 27500
 * 
 * 
 * -----Experience > 5 years-------
 * 
 * Enter Employee name :
 * Himakar
 * Enter Employee salary :
 * 25000
 * Enter Employee Experience
 * 6
 * Employee Name : Himakar
 * Employee Salary : 25000
 * Employee Experience : 6
 * 32500
 */