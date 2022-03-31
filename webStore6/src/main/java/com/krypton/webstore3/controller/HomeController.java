package com.krypton.webstore3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping("/")
    public String welcome(Model model) {
        model.addAttribute("greeting", "Welcome to Web Store!");
        model.addAttribute("tagline", "The one and only amazing web store");
        //return "welcome";
        return "forward:/welcome/greeting"; // redirije a otro método del controller para que atienda la solicitud
//     return "redirect:/welcome/greeting"; // redirije a la vista

    }

    @RequestMapping("/welcome/greeting")
    public String greeting() {
        return "welcome";
    }

}
