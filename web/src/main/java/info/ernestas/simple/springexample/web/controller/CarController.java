package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarService carService;

    @RequestMapping("/all")
    public String getAllNames(Model model) {
        model.addAttribute("cars", carService.findAllCars());
        return "cars";
    }

}
