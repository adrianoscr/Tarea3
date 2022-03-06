
package com.tarea3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

//ESTA CLASE SE HACE CON EL SPRING FRAMEWORK, ES UNA CLASE ESPECIAL Y SE NECESITA PARA USAR LOS TEMPLATES.

@Controller
@Slf4j
public class IndexController {
    
    @RequestMapping("/")
    public String page(Model model) {
        model.addAttribute("Arquitectura MVC");
        return "index";
    }
    
}
