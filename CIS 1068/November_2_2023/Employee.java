package November_2_2023;

public class Employee {
    public double getSalary() {
        return 40000.0;
    }

    public int getVacationDays() {
        return 15;
    }

    public String toString() {
        return "Salary: " + this.getSalary() + "\nVacation days: " + this.getVacationDays();
    }
}
