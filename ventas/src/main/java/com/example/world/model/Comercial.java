package com.example.world.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Comercial {

    @Id
    private Integer id;
    private String nombre;
    private String apellido1;
    private String apellido2;
    private Float comision;

    @JsonManagedReference
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL , mappedBy = "comercial")
    private List<Pedido> pedidos = new ArrayList<>();

    public Comercial(){}

    public Comercial(Integer id, String nombre, String apellido1, String apellido2, Float comision, List<Pedido> pedidos) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.comision = comision;
        this.pedidos = pedidos;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Float getComision() {
        return comision;
    }

    public void setComision(Float comision) {
        this.comision = comision;
    }

    public List<Pedido> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<Pedido> pedidos) {
        this.pedidos = pedidos;
    }
}
