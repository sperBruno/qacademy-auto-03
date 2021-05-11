package com.company.store;

public class Productos {

    private String nombre;
    private int valor;
    private int cantidad;

    public Productos(String nombre, int valor, int cantidad) {
        this.nombre = nombre;
        this.valor = valor;
        this.cantidad = cantidad;
    }

    public int getPrice() {
        return this.valor;
    }

    public String getNombre() {
        return this.nombre;
    }

    public int getCantidad() {
        return cantidad;
    }
}
