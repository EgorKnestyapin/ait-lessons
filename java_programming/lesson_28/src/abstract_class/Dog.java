package abstract_class;

public class Dog extends Pet {
    private String name;
    private String breed;

    public Dog(String kind, int age, double weight, boolean gender, String name, String breed) {
        super(kind, age, weight, gender);
        this.name = name;
        this.breed = breed;
    }

    @Override
    public void eat() {
        System.out.println("Кушаю кашу и мясо");
    }

    @Override
    public void go() {
        System.out.println("Бегаю, все обнюхиваю");
    }

    @Override
    public void voice() {
        System.out.println("Гав-гав");
    }
}
