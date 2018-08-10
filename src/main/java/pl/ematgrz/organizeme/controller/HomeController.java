package pl.ematgrz.organizeme.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = {"/home", "/", ""})
    public String homeController(Model model){
        return "home";
    }
}
