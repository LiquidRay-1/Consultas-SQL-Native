package com.example.world.converter;

import com.example.world.model.Pedido;
import dto.PedidoDTO;
import org.springframework.stereotype.Component;

@Component
public class PedidoConverter {
    public PedidoDTO convertEntityToDTO(Pedido pedido){
        PedidoDTO pedidoDTO = new PedidoDTO();

        pedidoDTO.setFecha(pedido.getFecha());
        pedidoDTO.setImporte(pedido.getTotal());

        return pedidoDTO;
    }
}
