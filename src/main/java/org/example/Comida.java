package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@ToString
public class Comida extends Producto{
    private final double impuesto = 0.10;

    public Comida(double precio) {
        super(precio);
    }

    @Override
    public double calcularImpuesto(){
        return getPrecio() * impuesto;
    }
}
