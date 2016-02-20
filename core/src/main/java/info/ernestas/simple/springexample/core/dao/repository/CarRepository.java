package info.ernestas.simple.springexample.core.dao.repository;

import info.ernestas.simple.springexample.core.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Integer> {

}
