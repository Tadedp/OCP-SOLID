package org.example;

import lombok.*;
import java.util.ArrayList;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductosServicio {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto){
        productos.add(producto);
    }

    public double calcularPrecioTotal(){
        double total = 0;
        for (Producto producto : productos){
            total += producto.getPrecioFinal();
        }
        return total;
    }
}
