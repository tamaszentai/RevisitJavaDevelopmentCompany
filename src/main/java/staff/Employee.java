package staff;

public abstract class Employee {
    private String name;
    private String NIN;
    private double salary;

    public Employee(String name, String NIN, double salary) {
        this.name = name;
        this.NIN = NIN;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getNIN() {
        return NIN;
    }

    public double getSalary() {
        return salary;
    }

    public void raiseSalary(double raise) {
        double helper = this.salary * raise;
        this.salary += helper;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
