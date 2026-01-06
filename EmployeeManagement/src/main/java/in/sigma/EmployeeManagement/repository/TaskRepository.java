package in.sigma.EmployeeManagement.repository;

import in.sigma.EmployeeManagement.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TaskRepository extends JpaRepository<Task , Integer> {
}
