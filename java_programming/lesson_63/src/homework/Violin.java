package homework;

import java.time.LocalDate;

public class Violin implements Comparable<Violin> {
    private String violinistName;
    private LocalDate manufactureDate;

    public Violin(String violinistName, LocalDate manufactureDate) {
        this.violinistName = violinistName;
        this.manufactureDate = manufactureDate;
    }

    public String getViolinistName() {
        return violinistName;
    }

    public void setViolinistName(String violinistName) {
        this.violinistName = violinistName;
    }

    public LocalDate getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDate manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String toString() {
        return "Violin{" +
                "violinistName='" + violinistName + '\'' +
                ", manufactureDate=" + manufactureDate +
                '}';
    }

    @Override
    public int compareTo(Violin o) {
        return this.manufactureDate.compareTo(o.manufactureDate);
    }
}
