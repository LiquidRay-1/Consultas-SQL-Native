package dto;

import java.util.Date;

public class PedidoDTO {
    private Date fecha;
    private Double importe;

    public PedidoDTO(){}

    public PedidoDTO(Date fecha, Double importe) {
        this.fecha = fecha;
        this.importe = importe;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Double getImporte() {
        return importe;
    }

    public void setImporte(Double importe) {
        this.importe = importe;
    }
}
