package riwi.workshop.number_three.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import riwi.workshop.number_three.entities.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
}
