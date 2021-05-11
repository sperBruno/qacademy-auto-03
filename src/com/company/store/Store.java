package com.company.store;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Store {
    private List<Productos> carrito = new ArrayList<>();
    private DetalleSerializador detalleSerializador = new DetalleSerializador();
    private static Map<String, Integer> valorProductos = new HashMap<>();

    static {
        valorProductos.put("pan", 1);
        valorProductos.put("fideos", 5);
        valorProductos.put("bolsa de leche", 6);
    }

    public void agregarProducto(String nombre, int cantidad) {
        if (cantidad > 0) {
            carrito.add(new Productos(nombre, valorProductos.get(nombre.toLowerCase()), cantidad));
        }
    }

    public int calcularCostoTal() {
        int costo = 0;
        for (Productos producto : carrito) {
            costo += (producto.getPrice() * producto.getCantidad());
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
