package homework;

import java.util.Objects;

public class Alcohol {
    private String title;
    private int strength;
    private double price;

    public Alcohol(String title, int strength, double price) {
        this.title = title;
        this.strength = strength;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alcohol alcohol = (Alcohol) o;
        return strength == alcohol.strength && Double.compare(price, alcohol.price) == 0 && Objects.equals(title, alcohol.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, strength, price);
    }

    @Override
    public String toString() {
        return "Alcohol{" +
                "title='" + title + '\'' +
                ", strength=" + strength +
                ", price=" + price +
                '}';
    }
}
