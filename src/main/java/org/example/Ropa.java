package org.example;

public class Ropa extends Producto{
    private final double impuesto = 0.20;

    public Ropa(double precio) {
        super(precio);
    }

    @Override
    public double calcularImpuesto(){
        return getPrecio() * impuesto;
    }
}
