package practice.archive.dto;

import java.time.LocalDate;

public class DocumentDto {
    private String name;
    private String author;
    private LocalDate dateOfPublishing;

    public DocumentDto(String name, String author, LocalDate dateOfPublishing) {
        this.name = name;
        this.author = author;
        this.dateOfPublishing = dateOfPublishing;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public LocalDate getDateOfPublishing() {
        return dateOfPublishing;
    }
}
