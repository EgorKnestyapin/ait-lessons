package ait.employee;

import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;

public class EmployeeAppl {
    public static void main(String[] args) {
        Employee[] employees = new Employee[6];
        employees[0] = new Manager(1000, "John", "Smith", 160, 5000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
        printArray(employees);
        double total = totalSalary(employees);
        System.out.println("Total salary: " + total);
        total = totalSales(employees);
        System.out.println("Total sales: " + total);
    }

    private static double totalSales(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] instanceof SalesManager) {
                SalesManager sm = (SalesManager) employees[i];
                sum += sm.getSalesValue();
            }
        }
        return sum;
    }

    private static double totalSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum += employees[i].calcSalary();
        }
        return sum;
    }

    private static void printArray(Employee[] employees) {
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                System.out.println(employees[i]);
        }
    }
}
