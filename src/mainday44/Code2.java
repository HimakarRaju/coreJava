package mainday44;

public class Code2 {
    void empDetails(String dept) {
        this.empDetails("Ramya", 25000);
        System.out.println("Emp Dept: " + dept);
    }

    void empDetails(String name, int sal) {
        System.out.println("Employee Details");
        System.out.println("Name: " + name);
        System.out.println("Salary: " + sal);
    }

    public static void main(String[] args) {
        Code2 obj = new Code2();
        obj.empDetails("IT");
    }
}
