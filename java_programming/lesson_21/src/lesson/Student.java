package lesson;

public class Student {
    private String name;
    private static int questionsCounter;


    public Student(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student" + name;
    }

    public void ask() {
        System.out.println(name + " ask the question # " + ++questionsCounter);
    }
}
