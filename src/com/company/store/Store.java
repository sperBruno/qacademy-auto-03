package com.company.store;

import java.util.ArrayList;
import java.util.List;

public class Store {
    private List<Productos> carrito = new ArrayList<>();
    private DetalleSerializador detalleSerializador = new DetalleSerializador();

    public void agregarProducto(String nombre, int valor) {
        carrito.add(new Productos(nombre, valor));
    }

    public int calcularCostoTal() {
        int costo = 0;
        for (Productos producto : carrito) {
            costo += producto.getPrice();
        }
        return costo;
    }

    public void eliminarProducto(String nombre) {
        List<Productos> aux = new ArrayList<>();
        aux.addAll(carrito);

        for (Productos producto : aux) {
            if (producto.getNombre().equals(nombre)) {
                carrito.remove(producto);
            }
        }
    }

    public String obtenerDetalleCompra() {
        return detalleSerializador.getDetalle(carrito, this.calcularCostoTal());
    }
}
