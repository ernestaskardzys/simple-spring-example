package info.ernestas.simple.springexample.core.dao.impl;

import info.ernestas.simple.springexample.core.dao.NameDao;
import info.ernestas.simple.springexample.core.dao.repository.NameRepository;
import info.ernestas.simple.springexample.core.model.Name;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class NameDaoImpl implements NameDao {

    @Autowired
    private NameRepository nameRepository;

    @Override
    @Cacheable("namesCache")
    public List<Name> findAll() {
        return nameRepository.findAll();
    }

    @Override
    public Name findByIdAndName(Integer id, String name) {
        return nameRepository.findByIdAndName(id, name);
    }

}
