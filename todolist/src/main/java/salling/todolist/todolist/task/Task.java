package salling.todolist.todolist.task;

import jakarta.persistence.*;

@Entity
@Table(name="todos")
public class Task {
    @Id
    @SequenceGenerator(
            name="task_seq",
            sequenceName = "task_seq",
            allocationSize = 1)
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "task_seq"
    )
    private Long id;
    private String text;
    private Status status;
    public Task( ) {

    }

    public Task(long id, String text, Status status) {
        this.id = id;
        this.text = text;
        this.status = status;
    }
    public Task(String text, Status status) {

        this.text = text;
        this.status = status;
    }
    public long getid() {
        return id;
    }

    public void setid(long id) {
        this.id = id;
    }

    public String gettext() {
        return text;
    }

    public void settext(String text) {
        this.text = text;
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
                ", text='" + text + '\'' +
                ", status=" + status +
                '}';
    }

    public enum Status {
        TODO,
        DONE
    }
}
