package ait.user.model;

public class QAEngineer extends Employee{
    public QAEngineer(String name, int salary) {
        super(name, salary);
    }

    @Override
    public String toString() {
        return "QAEngineer{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                '}';
    }

    public void work() {
        System.out.println("I'm " + super.getName() + " and I'm QA engineer, I check soft");
    }
}
