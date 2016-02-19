package info.ernestas.simple.springexample.core.service.impl;

import info.ernestas.simple.springexample.core.dao.NameDao;
import info.ernestas.simple.springexample.core.model.Name;
import info.ernestas.simple.springexample.core.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class NameServiceImpl implements NameService {

    @Autowired
    private NameDao nameDao;

    @Override
    public List<Name> findAllNames() {
        return nameDao.findAll();
    }

}
