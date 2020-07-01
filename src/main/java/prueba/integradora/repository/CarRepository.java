package prueba.integradora.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import prueba.integradora.domain.Car;

@Repository
public interface CarRepository extends JpaRepository<Car,Integer> {
}
