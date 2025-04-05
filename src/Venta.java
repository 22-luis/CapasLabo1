import java.util.Date;

public class Venta {

    private String libro; //cambiar por tipo libro
    private Integer cantidadVendida;
    private Date fechaVenta;

    public Venta(String libro, Integer cantidadVendida, Date fechaVenta) {
        this.libro = libro;
        this.cantidadVendida = cantidadVendida;
        this.fechaVenta = fechaVenta;
    }

    public String getLibro() {
        return libro;
    }

    public void setLibro(String libro) {
        this.libro = libro;
    }

    public Integer getCantidadVendida() {
        return cantidadVendida;
    }

    public void setCantidadVendida(Integer cantidadVendida) {
        this.cantidadVendida = cantidadVendida;
    }

    public Date getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(Date fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    //metodo para registrar venta
    public void registrarVenta() {}

    //metodo paar mostrar venta
    public void mostrarVenta() {}
}
