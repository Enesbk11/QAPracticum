package employee;

public class Employee {

    String name;
    int salary;
    int workHours;
    int hireYear;

    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;

    }

    public void tostring() {
        System.out.println("Calisana ait bilgiler:");
        System.out.println("Adi:" + this.name);
        System.out.println("Maasi:" + this.salary);
        System.out.println("Calisma saati:" + this.workHours);
        System.out.println("Baslangic Yili:" + this.hireYear);

    }

    public double tax() {
        double taxRate = 0;

        if (salary < 1000) {
            taxRate = 0;

        } else if (salary > 1000) {
            taxRate = salary * 0.03;

        }
        return taxRate;

    }

    public double bonus() {
        double bonusRate = 0;
        if (workHours > 40) {
            bonusRate = (workHours - 40) * 30;
            return bonusRate;
        }
        return bonusRate;
    }

    public double raiseSalary() {
        double rs = 0;
        int currentYear = 2021;
        if (currentYear - hireYear < 10) {
            rs = salary * 0.05;
            return rs;
        } else if (currentYear - hireYear > 9 && currentYear - hireYear < 20) {
            rs = salary * 0.1;
            return rs;

        } else if (currentYear - hireYear > 19) {
            rs = salary * 0.15;
            return rs;

        }
        return rs;
    }

    public static void main(String[] args) {
        Employee employee = new Employee("Enes", 2000, 45, 1985);
        employee.tostring();

        System.out.println("Bonus:" + employee.bonus());
        System.out.println("Maas Artisi:" + employee.raiseSalary());
        System.out.println("Vergi ve bonuslar ile birlikte maas:"
                + (employee.bonus() - employee.tax() + employee.salary));
        System.out.println("Toplam maas:"
                + (employee.salary + employee.bonus() - employee.tax() + employee.raiseSalary()));

    }

}
