package com.example.world.controller;

import com.example.world.service.ClienteService;
import dto.ClienteDTO;
import dto.ClientePedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/cliente")
public class ClienteController {

    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<ClienteDTO> list(){

        return clienteService.listaClientesDTO();
    }

    @GetMapping("{id}")
    public ClientePedidoDTO getPedidos(@PathVariable Integer id){
        return clienteService.pedidosClienteNative(id);
    }
}
