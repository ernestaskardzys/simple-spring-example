package info.ernestas.simple.springexample.core.service.impl;

import info.ernestas.simple.springexample.core.dao.StudentDao;
import info.ernestas.simple.springexample.core.model.Student;
import info.ernestas.simple.springexample.core.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentDao studentDao;

    @Override
    public List<Student> getStudents() {
        return studentDao.findAllStudents();
    }

}
