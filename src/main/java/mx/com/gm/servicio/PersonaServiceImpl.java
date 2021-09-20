package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.dao.PersonaDao;
import mx.com.gm.domain.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class PersonaServiceImpl implements PersonaService {

    @Autowired
    private PersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)
    public List<Person> listarPersonas() {
        return (List<Person>) personaDao.findAll();
    }

    @Override
    @Transactional
    public void guardar(Person persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Person persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Person encontrarPersona(Person persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
    }
}
