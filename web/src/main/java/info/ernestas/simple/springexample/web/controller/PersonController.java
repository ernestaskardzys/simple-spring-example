package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/persons")
public class PersonController {

    @Autowired
    private PersonService personService;

    @RequestMapping("/all")
    public String getAllNames(Model model) {
        model.addAttribute("persons", personService.findAllNames());
        return "persons";
    }

}
