
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
@Table(name="producto") //SE HACE REFERENCIA A LA TABLA.
public class Producto implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    //Atributos del producto.
    
    @Id //INDICAMOS QUE ESTE ES EL ID DE LA TABLA.
    @GeneratedValue(strategy = GenerationType.IDENTITY) //BUSQUE POR ID
    private Long idproducto;
    
    private String nombre;
    private String marca;
    private String descripcion;
    private String stock;
    private String descuento;
    private String precio;

    //CONSTRUCTOR ORIGINAL.
    public Producto() {
    }

    //CONTRUCTOR USABLE.
    public Producto(String nombre, String marca, String descripcion, String stock, String descuento, String precio) {
        this.nombre = nombre;
        this.marca = marca;
        this.descripcion = descripcion;
        this.stock = stock;
        this.descuento = descuento;
        this.precio = precio;
    } 
    
}
