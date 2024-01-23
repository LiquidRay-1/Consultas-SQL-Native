package dto;

import java.util.List;

public class ClientePedidoDTO {
    private String cliente;
    private List<PedidoDTO> pedidos;
    public ClientePedidoDTO(){}

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public List<PedidoDTO> getPedidos() {
        return pedidos;
    }

    public void setPedidos(List<PedidoDTO> pedidos) {
        this.pedidos = pedidos;
    }
}
