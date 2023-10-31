package salling.todolist.todolist.task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.Optional;

/**
 *
 */
@Repository
public interface TaskRepository  extends JpaRepository<Task, Long> {

//    @Query("SELECT t FROM Task t WHERE t.Status =?'TODO'")
//    Optional<Task> findTaskByStatus(Task.Status status);

}
