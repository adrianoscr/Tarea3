package com.tarea3.service;

import com.tarea3.domain.Producto;
import java.util.List;

public interface ProductoService {
    
    //Nos devuelve todos los producto de la base de datos.
    public List<Producto> getClientes();

    //Si viene el id lo modifica y si no lo agrega
    public void save(Producto producto);

    //Borra el registro
    public void delete(Producto producto);

    //Lo consiguen
    public Producto getCliente(Producto producto);
}
