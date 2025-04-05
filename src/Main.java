public class Main {
    private static List<Libro> libros = new ArrayList<>();
    private static List<Venta> ventas = new ArrayList<>();

    public static void main(String[] args) {
        //Libros iniciales
        libro1 = new Libro("1", "El Principito", "Antoine de Saint-Exupéry", 10.99);
        libro2 = new Libro("2", "Cien años de soledad", "Gabriel García Márquez", 15.99);
        libro3 = new Libro("3", "1984", "George Orwell", 12.99);
        libro4 = new Libro("4", "El gran Gatsby", "F. Scott Fitzgerald", 14.99);

        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);

        //Ventas iniciales
        venta1 = new Venta(libro1, 2, new Date());
        venta2 = new Venta(libro2, 1, new Date());
        venta3 = new Venta(libro3, 3, new Date());
        venta4 = new Venta(libro4, 1, new Date());

        ventas.add(venta1);
        ventas.add(venta2);
        ventas.add(venta3);
        ventas.add(venta4);





    }



}