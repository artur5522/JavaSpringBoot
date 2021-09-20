package mx.com.gm.servicio;

import java.util.List;
import mx.com.gm.domain.Person;

public interface PersonaService {
    
    public List<Person> listarPersonas();
    
    public void guardar(Person persona);
    
    public void eliminar(Person persona);
    
    public Person encontrarPersona(Person persona);
}
