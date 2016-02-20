package info.ernestas.simple.springexample.core.dao;

import info.ernestas.simple.springexample.core.model.Car;

import java.util.List;

public interface CarDao {

    List<Car> findAll();

}
