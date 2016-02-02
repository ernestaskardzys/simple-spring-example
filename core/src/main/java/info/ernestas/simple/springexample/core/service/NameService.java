package info.ernestas.simple.springexample.core.service;

import info.ernestas.simple.springexample.core.dao.NameDao;
import info.ernestas.simple.springexample.core.model.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NameService {

    @Autowired
    private NameDao nameDao;

    public List<Name> findAllNames() {
        return nameDao.findAll();
    }

}
