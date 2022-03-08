
package com.tarea3.dao;

import com.tarea3.domain.Cliente;
import org.springframework.data.repository.CrudRepository;


//CON ESTA FUNCIÓN HAGO LA INTERFAZ CON LA BASE DE DATOS.
public interface ClienteDao extends CrudRepository<Cliente, Long>{
    
}
