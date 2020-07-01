package prueba.integradora.service;

import prueba.integradora.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import prueba.integradora.repository.CarRepository;

import java.util.List;

@Service
public class CarService {

    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public Car add(final Car car){return carRepository.save(car); }

    public List<Car> getCar(){ return carRepository.findAll(); }

}
