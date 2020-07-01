package prueba.integradora.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.integradora.domain.Persona;
import prueba.integradora.repository.PersonaRepository;

import java.util.List;

@Service
public class PersonaService {

    private final PersonaRepository personaRepository;

    @Autowired
    public PersonaService(PersonaRepository personaRepository) {
        this.personaRepository = personaRepository;
    }

    public Persona add(final Persona persona){ return personaRepository.save(persona);
    }

    public List<Persona> getPersona(){
        return personaRepository.findAll();
    }
}
