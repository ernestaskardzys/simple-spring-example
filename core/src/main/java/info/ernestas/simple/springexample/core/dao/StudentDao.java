package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.model.Student;

import java.util.List;

public interface StudentDao {

    List<Student> findAllStudents();

}
