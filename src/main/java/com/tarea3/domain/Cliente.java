
package com.tarea3.domain;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;

@Data  //PERMITE USAR GET Y SET SIN NECESIDAD DE CODIFICARLOS.
@Entity //SE HACE LA ENTIDAD.
@Table(name="cliente") //SE HACE REFERENCIA A LA TABLA.
public class Cliente implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id  //SE LE INDICA QUE TIENE EL ID
    @GeneratedValue(strategy = GenerationType.IDENTITY) //BUSQUE POR ID
    private Long idcliente;
    
    private String nombre;
    private String apellidos;
    private String correo;
    private String telefono;
    private String solicitud;

    
    //CONSTRUCTOR ORIGINAL
    public Cliente() {
    }

    //NUEVO CONSTRUCTOR
    public Cliente(String nombre, String apellidos, String correo, String telefono, String solicitud) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.correo = correo;
        this.telefono = telefono;
        this.solicitud = solicitud;
    }

    //LOS SET Y GET YA SE SOBRE ENTIENDEN.
}