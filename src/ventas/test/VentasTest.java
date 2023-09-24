package ventas.test;

import mx.com.gm.ventas.*;

public class VentasTest {
    public static void main(String[] args) {
        Producto producto = new Producto( "Camisa", 50 );
        Producto producto2 =  new Producto( "Pantalon", 100.0);

        Orden orden1 = new Orden();

        orden1.agregarProducto( producto );
        orden1.agregarProducto( producto2 );
        orden1.mostrarOrden();

        Producto producto3 = new Producto( "Sueter", 300);
        Orden orden2 = new Orden();

        orden2.agregarProducto( producto2 );
        orden2.agregarProducto( producto );
        orden2.agregarProducto( producto3 );
        orden2.mostrarOrden();
    }
}
