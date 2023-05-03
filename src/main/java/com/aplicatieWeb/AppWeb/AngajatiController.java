package com.aplicatieWeb.AppWeb;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AngajatiController {
    @GetMapping("/Angajati")
    public String getAngajati(Model model) {

        model.addAttribute("Geani",new Angajati("Luna","Geani",21,"Ospatar"));
        model.addAttribute("Marius",new Angajati("Popescu","Marius",23,"Ospatar"));
        model.addAttribute("Dani",new Angajati("Popescu","Daniel",28,"Manager"));

      return "Angajati";

    }

}
