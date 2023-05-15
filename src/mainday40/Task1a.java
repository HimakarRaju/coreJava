package mainday40;

public class Task1a {

    private String empName;
    private int empSalary;
    private int empExperience;

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpSalary() {
        return empSalary;
    }

    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    public int getEmpExp() {
        return empExperience;
    }

    public void setEmpExp(int empExp) {
        this.empExperience = empExp;
    }

    public int finalSalary() {

        if (empExperience <= 5) {

            return empSalary + (empSalary * 10 / 100);

        } else {
            return empSalary + (empSalary * 30 / 100);

        }

    }

}