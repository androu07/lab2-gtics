package com.example.lab2.controller;

import com.example.lab2.entity.CasillasPatitos;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {
    @RequestMapping(value = {"/patito_hule"}, method = RequestMethod.GET)
    public String index (){
        return "patito_hule";
    }

    @GetMapping("/persona2")
    public String formularioPersona (Model model){
        Persona persona3 = new Persona();
        model.addAttribute("persona", persona3);
        return "vista_fotos";
    }

    @PostMapping("/patito_hule/guardar")
    public String guardarPersona( CasillasPatitos casillasPatitos){
        return "vista_fotos";
    }


}
