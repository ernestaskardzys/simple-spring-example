package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.model.Name;

import java.util.List;

public interface NameDao {

    List<Name> findAll();

    Name findByIdAndName(Integer id, String name);

}
