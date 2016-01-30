package info.ernestas.simple.springexample.web.controller;

import info.ernestas.simple.springexample.core.dao.NameDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/names")
public class NameController {

    // TODO Call service instead of DAO layer...
    @Autowired
    private NameDao nameDao;

    @RequestMapping("/getallnames")
    public String getAllNames(Model model) {
        model.addAttribute("names", nameDao.findAll());
        return "names";
    }

}
