package practice.archive.model;

import java.time.LocalDate;
import java.util.Objects;

public class Document {
    private static int counter = 1;
    private int id;
    private String name;
    private String author;
    private LocalDate dateOfPublishing;

    public Document(String name, String author, LocalDate dateOfPublishing) {
        id = counter++;
        this.name = name;
        this.author = author;
        this.dateOfPublishing = dateOfPublishing;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }

    public void setDateOfPublishing(LocalDate dateOfPublishing) {
        this.dateOfPublishing = dateOfPublishing;
    }

    @Override
    public String toString() {
        return "Document{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", dateOfPublishing=" + dateOfPublishing +
                '}';
    }
}
