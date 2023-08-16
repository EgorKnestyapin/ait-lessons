package lesson;

public class Programmer extends Employee{
    public Programmer(String name, int salary) {
        super(name, salary); // super is the reference to Employee class
    }

    @Override
    public String toString() {
        return "Programmer{" +
                "name='" + super.getName() + '\'' +
                ", salary=" + super.getSalary() +
                '}';
    }

    public void work() {
        System.out.println("I'm " + super.getName() + " and I'm developer, I write soft");
    }
}
