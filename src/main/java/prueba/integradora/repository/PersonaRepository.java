package prueba.integradora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.integradora.domain.Persona;

@Repository
public interface PersonaRepository extends JpaRepository<Persona, Integer>{

}
