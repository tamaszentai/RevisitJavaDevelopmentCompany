package staff;

public abstract class Employee {
    private String name;
    private String NIN;
    protected double salary;

    public Employee(String name, String NIN, double salary) {
        this.name = name;
        this.NIN = NIN;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null) {
            this.name = name;
        }
    }

    public String getNIN() {
        return NIN;
    }

    public double getSalary() {
        return salary;
    }


    public void raiseSalary(double raise) {
        if (raise > 0) {
            double helper = this.salary * raise;
            this.salary += helper;
        }

    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
