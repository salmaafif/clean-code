import java.util.ArrayList;
import java.util.List;

public class SalaryCalculatorApp {

    public static void main(String[] args) {
        System.out.println("=== Program Perhitungan Gaji Karyawan ===");

        List<Employee> employees = new ArrayList<>();
        employees.add(new Staff("Budi", 40, 50000));
        employees.add(new Staff("Ani", 38, 45000));
        employees.add(new Manager("Toni", 45, 60000));

        // Memproses dan menampilkan gaji untuk setiap karyawan
        for (Employee employee : employees) {
            printSalaryDetails(employee);
        }
    }

    public static void printSalaryDetails(Employee employee) {
        String role = employee instanceof Manager ? "Manager" : "Staff";
        double salary = employee.calculateSalary();
        
        System.out.printf("Karyawan: %s (%s) | Gaji: Rp %,.2f\n", 
            employee.getName(), role, salary);
    }
}

abstract class Employee {
    private String name;
    protected int hoursWorked;

    public Employee(String name, int hoursWorked) {
        this.name = name;
        this.hoursWorked = hoursWorked;
    }

    // Getter untuk mengakses atribut private
    public String getName() {
        return this.name;
    }

    // Abstract method yang wajib diimplementasikan oleh subclass
    public abstract double calculateSalary();
}

class Staff extends Employee {
    private double ratePerHour;

    public Staff(String name, int hoursWorked, double ratePerHour) {
        super(name, hoursWorked); // Memanggil constructor kelas induk
        this.ratePerHour = ratePerHour;
    }

    @Override
    public double calculateSalary() {
        // Logika perhitungan gaji untuk Staff
        return this.hoursWorked * this.ratePerHour;
    }
}

class Manager extends Employee {
    private double baseSalary; // Gaji pokok per jam untuk manajer

    public Manager(String name, int hoursWorked, double baseSalary) {
        super(name, hoursWorked);
        this.baseSalary = baseSalary;
    }

    @Override
    public double calculateSalary() {
        // Logika perhitungan gaji untuk Manager (bisa berbeda)
        // Contoh: manajer mendapat bonus 15%
        double salary = this.hoursWorked * this.baseSalary;
        double bonus = salary * 0.15;
        return salary + bonus;
    }
}