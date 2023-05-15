package mainday15;

public class ClassA {
    String empName; // Instance variable
    String empDept; // Instance variable
    int empId; // Instance variable

    static String company = "TCS"; //static variable used for common properties of a class

    ClassA(String name, String dept, int id)// parameterized constructor used for assigning values for instance variables
    {
        empName = name;
        empDept = dept;//Assigning local variable to the Instance variables
        empId = id;
    }

    public static void main(String[] args) {
        ClassA aobj1 = new ClassA("Kishan", "JAVA", 101);
        ClassA aobj2 = new ClassA("Ahmed", "AWS", 102);
        ClassA aobj3 = new ClassA("Rachel", "DATABASE", 103);

        System.out.println("aobj1 : " + aobj1.empName + " " + aobj1.empDept + " " + aobj1.empId + " " + ClassA.company); // aobj1.company ==> ClassA.company->static way
        System.out.println("aobj2 : " + aobj2.empName + " " + aobj2.empDept + " " + aobj2.empId + " " + ClassA.company); // aobj2.company
        System.out.println("aobj1 : " + aobj3.empName + " " + aobj3.empDept + " " + aobj3.empId + " " + ClassA.company); // aobj3.company
        
        System.out.println("----------------------------------------------------------------------------------------");

        aobj1.empName = "Kishan Basina"; // updating an instance variable reflects only on that object.
        ClassA.company = "HCL";//Updating a static variable reflects to all the objects present in the program

        System.out.println("aobj1 : " + aobj1.empName + " " + aobj1.empDept + " " + aobj1.empId + " " + ClassA.company);
        System.out.println("aobj2 : " + aobj2.empName + " " + aobj2.empDept + " " + aobj2.empId + " " + ClassA.company);
        System.out.println("aobj3 : " + aobj3.empName + " " + aobj3.empDept + " " + aobj3.empId + " " + ClassA.company);

    }
    
}
