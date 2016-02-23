package info.ernestas.simple.springexample.core.dao.impl;

import info.ernestas.simple.springexample.core.dao.StudentDao;
import info.ernestas.simple.springexample.core.dao.repository.StudentRepository;
import info.ernestas.simple.springexample.core.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public List<Student> findAllStudents() {
        return studentRepository.findAll();
    }
}
