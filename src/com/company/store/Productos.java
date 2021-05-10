package com.company.store;

public class Productos {

    private String nombre;
    private int valor;

    public Productos(String nombre, int valor) {
        this.nombre = nombre;
        this.valor = valor;
    }

    public int getPrice() {
        return this.valor;
    }

    public String getNombre() {
        return this.nombre;
    }
}
