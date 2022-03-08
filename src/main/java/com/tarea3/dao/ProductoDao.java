
package com.tarea3.dao;


import com.tarea3.domain.Producto;
import org.springframework.data.repository.CrudRepository;

//CON ESTA FUNCIÓN HAGO LA INTERFAZ CON LA BASE DE DATOS.
public interface ProductoDao extends CrudRepository<Producto, Long>{
    
}
