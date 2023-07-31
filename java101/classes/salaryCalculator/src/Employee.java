public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    double tax() {
        if (this.salary >= 1000) {
            return this.salary * 0.03;
        } else {
            return 0;
        }
    }

    double bonus() {
        if (this.workHours > 40) {
            return (this.workHours - 40) * 30;
        } else {
            return 0;
        }
    }

    double raiseSalary() {
        int workingDuration = 2021 - hireYear;
        if (workingDuration < 10) {
            return this.salary * 0.05;
        } else if (workingDuration < 20) {
            return this.salary * 0.10;
        } else {
            return this.salary * 0.15;
        }
    }

    public String toString() {
        System.out.println("Employee's name: " + this.name);
        System.out.println("Salary: " + this.salary);
        System.out.println("Weekly working hours: " + this.workHours);
        System.out.println("Hired in: " + this.hireYear);
        System.out.println("Tax: " + this.tax());
        System.out.println("Bonus: " + this.bonus());
        System.out.println("Salary increment depending on years: " + this.raiseSalary());
        System.out.println("Salary (with Tax and Bonus): " + ((this.salary + this.bonus()) - this.tax()));
        System.out.println("Total Salary: " + (this.salary + this.raiseSalary()));
        return null;
    }
}
