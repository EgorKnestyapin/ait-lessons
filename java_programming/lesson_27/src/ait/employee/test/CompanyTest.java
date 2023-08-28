package ait.employee.test;

import ait.employee.dao.Company;
import ait.employee.dao.CompanyImpl;
import ait.employee.model.Employee;
import ait.employee.model.Manager;
import ait.employee.model.SalesManager;
import ait.employee.model.WageEmployee;

import static org.junit.jupiter.api.Assertions.*;

class CompanyTest {
    Employee[] employees;
    Company company;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        company = new CompanyImpl(6);
        employees = new Employee[5];
        employees[0] = new Manager(1000, "John", "Smith", 160, 5000, 5);
        employees[1] = new WageEmployee(2000, "Mary", "Smith", 160, 15);
        employees[2] = new SalesManager(3000, "Peter", "Jackson", 160, 20000, 0.1);
        employees[3] = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null) {
                company.addEmployee(employees[i]);
            }
        }
    }

    @org.junit.jupiter.api.Test
    void addEmployee() {
        assertFalse(company.addEmployee(null));
        assertFalse(company.addEmployee(employees[1]));
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        assertEquals(5, company.quantity());
        employee = new SalesManager(4000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
        employee = new SalesManager(6000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertTrue(company.addEmployee(employee));
        employee = new SalesManager(7000, "Rabindranate", "Anand", 80, 30000, 0.1);
        assertFalse(company.addEmployee(employee));
    }

    @org.junit.jupiter.api.Test
    void removeEmployee() {
        assertEquals(employees[1], company.removeEmployee(2000));
        assertEquals(3, company.quantity());
        assertNull(company.removeEmployee(2000));
        assertNull(company.removeEmployee(9999));
    }

    @org.junit.jupiter.api.Test
    void findEmployee() {
        assertEquals(employees[1], company.findEmployee(2000));
        assertNull( company.findEmployee(9999));
        company.removeEmployee(3000);
        assertNull(company.findEmployee(3000));
    }

    @org.junit.jupiter.api.Test
    void quantity() {
        assertEquals(4, company.quantity());
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        company.addEmployee(employee);
        assertEquals(5, company.quantity());
        company.removeEmployee(5000);
        assertEquals(4, company.quantity());
    }

    @org.junit.jupiter.api.Test
    void totalSalary() {
        assertEquals(totalSalary(employees), company.totalSalary(), 0.01);
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        company.addEmployee(employee);
        employees[4] = employee;
        assertEquals(totalSalary(employees), company.totalSalary(), 0.01);
        company.removeEmployee(5000);
        employees[4] = null;
        assertEquals(totalSalary(employees), company.totalSalary(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void avgSalary() {
        assertEquals(totalSalary(employees) / (employees.length - 1), company.totalSalary(), 0.01);
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        company.addEmployee(employee);
        employees[4] = employee;
        assertEquals(totalSalary(employees) / employees.length, company.totalSalary(), 0.01);
        company.removeEmployee(5000);
        employees[4] = null;
        assertEquals(totalSalary(employees) / (employees.length - 1), company.totalSalary(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void totalSales() {
        assertEquals(totalSales(employees), company.totalSales(), 0.01);
        Employee employee = new SalesManager(5000, "Rabindranate", "Anand", 80, 30000, 0.1);
        company.addEmployee(employee);
        employees[4] = employee;
        assertEquals(totalSales(employees), company.totalSales(), 0.01);
        company.removeEmployee(5000);
        employees[4] = null;
        assertEquals(totalSales(employees), company.totalSales(), 0.01);
    }

    @org.junit.jupiter.api.Test
    void printEmployees() {
        company.printEmployees();
    }

    private double totalSales(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null && employees[i] instanceof SalesManager) {
                SalesManager sm = (SalesManager) employees[i];
                sum += sm.getSalesValue();
            }
        }
        return sum;
    }

    private double totalSalary(Employee[] employees) {
        double sum = 0;
        for (int i = 0; i < employees.length; i++) {
            if (employees[i] != null)
                sum += employees[i].calcSalary();
        }
        return sum;
    }
}