/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author giovanni.lebro
 */
public class Cliente {
    private String nombre;
    private String id;
    private String empresa;

    public Cliente() {
    }
    public Cliente(String nombre, String id, String empresa) {
        this.nombre = nombre;
        this.id = id;
        this.empresa = empresa;
    }
    public String getEmpresa() {
        return empresa;
    }
    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public String toString() {
        return nombre + "," + id + "," + empresa;
    }
}
