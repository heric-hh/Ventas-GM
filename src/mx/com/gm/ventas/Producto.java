package mx.com.gm.ventas;

public class Producto {
    private final int ID_PRODUCTO;
    private String nombre;
    private double precio;

    //contadorProductos guarda la cantidad de instancias de Producto que se han realizado
    private static int contadorProductos;

    private Producto() {
        this.ID_PRODUCTO = ++Producto.contadorProductos;
    }

    public Producto( String nombre, double precio ) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdProducto() { return this.ID_PRODUCTO; }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "PRODUCTO { ID Producto: " + this.ID_PRODUCTO + " nombre: " + this.nombre + " precio: " + this.precio;
    }
}
