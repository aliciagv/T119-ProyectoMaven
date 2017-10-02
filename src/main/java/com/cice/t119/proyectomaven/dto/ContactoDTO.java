
package com.cice.t119.proyectomaven.dto;

import java.util.List;

/**
 *
 * @author cice
 */
public class ContactoDTO {
    
    private String nombre;
    private String apellido1, apellido2;
    private String telefono;
    private DireccionDTO direccion;
    private List<String> email;

    public ContactoDTO() {
    }

    public ContactoDTO(String nombre, String apellido1, String apellido2, String telefono) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido1() {
        return apellido1;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public DireccionDTO getDireccion() {
        return direccion;
    }

    public void setDireccion(DireccionDTO direccion) {
        this.direccion = direccion;
    }

    public List<String> getEmail() {
        return email;
    }

    public void setEmail(List<String> email) {
        this.email = email;
    }
    
    
    
    
    
}
