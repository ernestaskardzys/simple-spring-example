package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/house")
public class HouseController {

    @Autowired
    private NameService nameService;

    @RequestMapping("/show")
    public String showHouse(Model model) {
        model.addAttribute("vardas", nameService.getName());
        return "show";
    }

}
