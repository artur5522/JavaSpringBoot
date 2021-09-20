package mx.com.gm.dao;

import mx.com.gm.domain.Person;
import org.springframework.data.repository.CrudRepository;

public interface PersonaDao extends CrudRepository<Person, Long>{
    
}
