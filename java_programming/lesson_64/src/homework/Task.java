package homework;

import java.time.LocalDate;

public class Task {
    private String title;
    private String description;
    private Status status;
    private LocalDate date;

    public Task(String title, String description, LocalDate date) {
        this.title = title;
        this.description = description;
        this.status = Status.UNFINISHED;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Task{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", status=" + status +
                ", date=" + date +
                '}';
    }

    public void switchStatus() {
        if (status == Status.UNFINISHED) {
            status = Status.FINISHED;
        } else {
            status = Status.UNFINISHED;
        }
    }

    public void changeTitle(String title) {
        if (title.isEmpty()) return;
        this.title = title;
    }
}
