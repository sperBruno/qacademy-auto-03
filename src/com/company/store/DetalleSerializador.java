package com.company.store;

import java.util.List;

public class DetalleSerializador {
    public String getDetalle(List<Productos> carrito, int costoTotal) {
        StringBuilder sb = new StringBuilder();
        for (Productos producto: carrito) {
            sb.append(String.format("%s - %s - Bs. %s\n", producto.getCantidad(), producto.getNombre(), producto.getPrice()));
        }
        sb.append(String.format("Total - Bs. %s", costoTotal));
        return sb.toString();
    }
}
