public class Libro {
    private String id;
    private String titulo;
    private String autor;
    private double precio;
    private int ventasTotales;
}

public Libro( String id, String titulo, String autor, double precio) {
    this.id = id;
    this.titulo = titulo;
    this.autor = autor;
    this.precio = precio;
    this.ventasTotales = 0;
}

public String getId() {
    return id;
}

public void setId(String id) {
    this.id = id;
}

public String getTitulo() {
    return titulo;
}

public void setTitulo(String titulo) {
    this.titulo = titulo;
}

public String getAutor() {
    return autor;
}

public void setAutor(String autor) {
    this.autor = autor;
}

public double getPrecio() {
    return precio;
}

public void setPrecio(double precio) {
    this.precio = precio;
}

public int getVentasTotales() {
    return ventasTotales;
}

public void setVentasTotales(int ventasTotales) {
    this.ventasTotales = ventasTotales;
}

@override
public String toString() {
    return "Libro{" +
            "id: '" + id + '\'' +
            ", titulo: '" + titulo + '\'' +
            ", autor: '" + autor + '\'' +
            ", precio: " + precio +
            ", ventasTotales: " + ventasTotales +
            '}';
}

public void actualizarVentas(int cantidadVendida) {
    this.ventasTotales += cantidadVendida;
}

