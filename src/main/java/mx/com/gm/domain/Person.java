package mx.com.gm.domain;

import java.io.Serializable;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import lombok.Data;

@Data
@Entity
@Table(name = "person")
public class Person implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Persona")
    private Long idPersona;
    
    @NotEmpty
    private String nombre;
    
    @NotEmpty
    private String apellido;
    
    @NotEmpty
    @Email
    private String email;
    
    private String telefono;
}
