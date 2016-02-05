package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.service.NameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/names")
public class NameController {

    @Autowired
    private NameService nameService;

    @RequestMapping("/getAllNames")
    public String getAllNames(Model model) {
        model.addAttribute("names", nameService.findAllNames());
        return "names";
    }

}
