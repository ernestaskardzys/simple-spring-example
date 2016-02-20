package info.ernestas.simple.springexample.core.dao.impl;

import info.ernestas.simple.springexample.core.dao.CarDao;
import info.ernestas.simple.springexample.core.dao.repository.CarRepository;
import info.ernestas.simple.springexample.core.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CarDaoImpl implements CarDao {

    @Autowired
    private CarRepository carRepository;

    @Override
    public List<Car> findAll() {
        return carRepository.findAll();
    }

}
