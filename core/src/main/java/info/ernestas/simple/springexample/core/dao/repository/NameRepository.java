package info.ernestas.simple.springexample.core.dao.repository;

import info.ernestas.simple.springexample.core.model.Name;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NameRepository extends JpaRepository<Name, Integer> {

    Name findByIdAndName(Integer id, String name);

}
