package info.ernestas.simple.springexample.core.service;

import info.ernestas.simple.springexample.core.model.Name;

import java.util.List;

public interface NameService {

    List<Name> findAllNames();

}
