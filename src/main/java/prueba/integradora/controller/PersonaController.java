package prueba.integradora.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import prueba.integradora.service.PersonaService;
import prueba.integradora.domain.Persona;

import java.util.List;

@RequestMapping("/persona")
@RestController
@Controller
public class PersonaController {


    private final PersonaService personaService;

    @Autowired
    public PersonaController(PersonaService personaService) {
        this.personaService = personaService;
    }

    @PostMapping("/")
    public void addPersona(@RequestBody Persona persona) { this.personaService.add(persona); }


    @GetMapping("/")
    public List<Persona> getPersona() { return this.personaService.getPersona();}
}
