package com.example.world.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

@Entity
public class Pedido {

    @Id
    private Integer id;
    private Double total;
    @Temporal(TemporalType.DATE)
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
    private Date fecha;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_comercial" , referencedColumnName = "id")
    private Comercial comercial;

    @JsonBackReference
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cliente" , referencedColumnName = "id")
    private Cliente cliente;

    public Pedido(){}

    public Pedido(Integer id, Double total, Date fecha, Comercial comercial, Cliente cliente) {
        this.id = id;
        this.total = total;
        this.fecha = fecha;
        this.comercial = comercial;
        this.cliente = cliente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Comercial getComercial() {
        return comercial;
    }

    public void setComercial(Comercial comercial) {
        this.comercial = comercial;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}
