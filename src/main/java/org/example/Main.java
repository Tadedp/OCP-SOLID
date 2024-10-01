package org.example;

public class Main {
    public static void main(String[] args) {
        // Open Closed Principle: Cada clase debe estar abierta para su extensión, pero cerrada para su modificación.
        // Siguiento el OCP, no se modifica la clase Producto cuando se agregan nuevos tipos de productos, sino que se extiende.
        // Comida y Ropa son extensiones de Producto que implementan la funcionalidad específica para cada tipo de producto.
        // ProductosServicio es la clase utilizada para gestionar todos los productos creados.

        ProductosServicio productosServicio = new ProductosServicio();

        Comida arroz = new Comida(1000);
        Ropa pantalon = new Ropa(2000);

        productosServicio.agregarProducto(arroz);
        productosServicio.agregarProducto(pantalon);

        System.out.println("Precio total arroz: " + arroz.getPrecioFinal());
        System.out.println("Precio total pantalon: " + pantalon.getPrecioFinal());
        System.out.println("Precio total de compra con impuestos: " + productosServicio.calcularPrecioTotal());
    }
}
