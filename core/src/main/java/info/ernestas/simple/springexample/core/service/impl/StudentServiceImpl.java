package info.ernestas.simple.springexample.core.service.impl;

import info.ernestas.simple.springexample.core.dao.StudentDao;
import info.ernestas.simple.springexample.core.dao.repository.StudentRepository;
import info.ernestas.simple.springexample.core.model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements info.ernestas.simple.springexample.core.service.StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.findAllStudents();
    }

}
