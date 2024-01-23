package com.example.world.service;

import com.example.world.converter.ClienteCoverter;
import com.example.world.model.Cliente;
import com.example.world.repository.ClienteRepository;
import dto.ClienteDTO;
import dto.ClientePedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteCoverter clienteCoverter;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listaClientes(){

        return clienteRepository.findAll();
    }

    public List<ClienteDTO> listaClientesDTO(){
        List<Cliente> clientes = clienteRepository.findAll();
        List<ClienteDTO> clienteDTOS = new ArrayList<>();

        clientes.forEach(cliente -> {
            clienteDTOS.add(clienteCoverter.convertEntityDTO(cliente));

        });

        return clienteDTOS;
    }

    public ClientePedidoDTO pedidosCliente(Integer id){
        Cliente cliente = clienteRepository.findById(id).orElse(null);
        return clienteCoverter.getClientePedidoDTO(cliente);
    }

    public ClientePedidoDTO pedidosClienteJPQL(Integer id){
        Cliente cliente = clienteRepository.buscarPedidosCliente(id);
        return clienteCoverter.getClientePedidoDTO(cliente);
    }

    public ClientePedidoDTO pedidosClienteNative(Integer id) {
        Cliente cliente = clienteRepository.buscarPedidosClienteNATIVE(id);
        return clienteCoverter.getClientePedidoDTO(cliente);
    }
}
