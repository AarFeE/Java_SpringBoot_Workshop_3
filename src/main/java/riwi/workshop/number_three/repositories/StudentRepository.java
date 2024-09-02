package riwi.workshop.number_three.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import riwi.workshop.number_three.entities.StudentEntity;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    @Query(value = "SELECT * FROM student WHERE isActive = true", nativeQuery = true)
    public abstract List<StudentEntity> getAllActive();
}
