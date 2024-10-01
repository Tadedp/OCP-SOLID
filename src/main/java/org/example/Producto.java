package org.example;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public abstract class Producto {
    private double precio;

    public abstract double calcularImpuesto();

    public double getPrecioFinal(){
        return precio + calcularImpuesto();
    }
}
