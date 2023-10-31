package salling.todolist.todolist.task;

import jakarta.persistence.*;

@Entity
@Table(name="todos")
public class Task {
    @Id

    @GeneratedValue(
            strategy = GenerationType.AUTO)
    private Long id;
    private String description;
    private Status status;
    public Task( ) {

    }

    public Task(long id, String description, Status status) {
        this.id = id;
        this.description = description;
        this.status = status;
    }
    public Task(String description, Status status) {

        this.description = description;
        this.status = status;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
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

    @Override
    public String toString() {
        return "Task{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", status=" + status +
                '}';
    }

    public enum Status {
        TODO,
        DONE
    }
}
