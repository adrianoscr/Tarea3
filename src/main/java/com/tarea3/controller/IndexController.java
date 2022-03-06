package com.tarea3.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

//ESTA CLASE SE HACE CON EL SPRING FRAMEWORK, ES UNA CLASE ESPECIAL Y SE NECESITA PARA USAR LOS TEMPLATES.
@Controller
@Slf4j
public class IndexController {

    //CON ESTO SE INDICA QUE COMIECE EL INDEX DEL TAMPLETE
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Arquitectura MVC");
        return "index";
    }

    //SE INDICA QUE SE USARÁ EL TAMPLATE CON ESE NOMBRE
    @GetMapping("/contactenos")
    public String cotactenos(Model model) {
        log.info("Arquitectura MVC");
        return "contactenos";
    }


}
