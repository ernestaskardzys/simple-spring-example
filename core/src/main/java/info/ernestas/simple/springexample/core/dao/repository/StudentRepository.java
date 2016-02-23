package info.ernestas.simple.springexample.core.dao.repository;

import info.ernestas.simple.springexample.core.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Integer> {

}
