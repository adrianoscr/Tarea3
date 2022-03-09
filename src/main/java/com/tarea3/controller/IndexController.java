package com.tarea3.controller;

import com.tarea3.domain.Producto;
import com.tarea3.service.ProductoService;
import java.util.Arrays;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

//ESTA CLASE SE HACE CON EL SPRING FRAMEWORK, ES UNA CLASE ESPECIAL Y SE NECESITA PARA USAR LOS TEMPLATES.
@Controller
@Slf4j
public class IndexController {

    @Autowired
    private ProductoService productoService;

    //CON ESTO SE INDICA QUE COMIECE EL INDEX DEL TEMPLATE
    @GetMapping("/")
    public String inicio(Model model) {
        log.info("Arquitectura MVC");

        return "index";
    }

    //SE INDICA QUE SE USARÁ EL TEMPLATE CON ESE NOMBRE
    @GetMapping("/contactenos")
    public String cotactenos(Model model) {
        log.info("Arquitectura MVC");
        return "contactenos";
    }

    //SE INDICA QUE SE USARÁ EL TEMPLATE CON ESE NOMBRE
    @GetMapping("/listar")
    public String listar(Model model) {
        log.info("Arquitectura MVC");

        //TRAE TODOS LOS REGISTROS DE LA TABLA DE CLIENTES O LO QUE SE NECESITE
        var productoDB = productoService.getProductos();
        model.addAttribute("productoDB", productoDB);

        return "listar";
    }

    //MAPEO AL LAS OPCIONES DE LA BASE DE DATOS
    @GetMapping("/nuevoProducto")
    public String nuevoProducto(Producto producto) {
        return "insertar";
    }

    @PostMapping("/guardarProducto")
    public String guardarProducto(Producto producto) {
        productoService.save(producto);
        return "redirect:/listar";
    }

    @GetMapping("/insertar/{idproducto}")
    public String modificarCliente(Producto producto, Model model) {

        var respuesta = productoService.getProducto(producto);
        model.addAttribute("producto", respuesta);
        return "insertar";
    }

    @GetMapping("/eliminarProducto/{idproducto}")
    public String eliminarCliente(Producto producto) {
        productoService.delete(producto);
        return "redirect:/";
    }

}
