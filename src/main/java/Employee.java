public abstract class Employee {
    private String name;
    private String NIN;
    private int salary;

    public void raiseSalary(double raise) {
        double helper = this.salary * raise;
        this.salary += helper;
    }

    public double payBonus() {
        return this.salary * 0.01;
    }
}
