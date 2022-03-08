
package com.tarea3.service;

import com.tarea3.domain.Cliente;
import java.util.List;


public interface ClienteService {
    
    //Nos devuelve todos los clientes de la base de datos.
    public List<Cliente> getClientes();
    
    //Si viene el id lo modifica y si no lo agrega
    public void save(Cliente cliente);
    
    //Borra el registro
    public void delete(Cliente cliente);
    
    //Lo consiguen
    public Cliente getCliente(Cliente cliente);
    
}
