/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.cice.t119.proyectomaven.dto;

/**
 *
 * @author cice
 */
public class DireccionDTO {
    
    private String calle,numero,cp,ciudad;

    public DireccionDTO() {
    }

    public DireccionDTO(String calle, String numero, String cp, String ciudad) {
        this.calle = calle;
        this.numero = numero;
        this.cp = cp;
        this.ciudad = ciudad;
    }

    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getCp() {
        return cp;
    }

    public void setCp(String cp) {
        this.cp = cp;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    
}
