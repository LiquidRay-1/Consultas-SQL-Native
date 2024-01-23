package com.example.world.converter;

import com.example.world.model.Cliente;
import com.example.world.model.Pedido;
import dto.ClienteDTO;
import dto.ClientePedidoDTO;
import dto.PedidoDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClienteCoverter {

    @Autowired
    private PedidoConverter pedidoConverter;
    public ClienteDTO convertEntityDTO(Cliente cliente){
        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setId(cliente.getId());
        clienteDTO.setNombre(cliente.getNombre());
        clienteDTO.setApellido1(cliente.getApellido1());
        clienteDTO.setApellido2(cliente.getApellido2());
        clienteDTO.setCategoria(cliente.getCategoria());
        clienteDTO.setCiudad(cliente.getCiudad());

        return clienteDTO;
    }

    public ClientePedidoDTO getClientePedidoDTO(Cliente cliente){
        ClientePedidoDTO clientePedidoDTO = new ClientePedidoDTO();

        clientePedidoDTO.setCliente(cliente.getNombre()+" "+cliente.getApellido1()+" "+cliente.getApellido2());
        List<Pedido> pedidos = cliente.getPedidos();
        List<PedidoDTO> pedidoDTO = new ArrayList<>();
        pedidos.forEach(pedido -> {
            pedidoDTO.add(pedidoConverter.convertEntityToDTO(pedido));
        });
        clientePedidoDTO.setPedidos(pedidoDTO);

        return clientePedidoDTO;
    }

}
