package prueba.integradora.controller;

import prueba.integradora.domain.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import prueba.integradora.service.CarService;

import java.util.List;

@RequestMapping("/car")
@RestController
@Controller
public class CarController {

    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @PostMapping("/")
    public void addCar(@RequestBody Car call) { this.carService.add(call); }


    @GetMapping("/")
    public List<Car> getCar() { return this.carService.getCar(); }


}
