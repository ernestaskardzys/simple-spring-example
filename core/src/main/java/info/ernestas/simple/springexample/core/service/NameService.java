package info.ernestas.simple.springexample.core.service;

import info.ernestas.simple.springexample.core.dao.NameDao;
import info.ernestas.simple.springexample.core.model.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NameService {

    @Autowired
    private NameDao nameDao;

    public List<Name> findAllNames() {
        return nameDao.findAll();
    }

}
