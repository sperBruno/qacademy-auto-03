package com.company.store;

import org.junit.Assert;
import org.junit.Test;

public class StoreTest {

    @Test
    public void calcularCostoSinProductosTest() {
        //AAA
        Store tienda = new Store();

        int expected = 0;

        //Act
        int actual = tienda.calcularCostoTal();

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void calcularCostoTotalTest() {
        //AAA
        Store tienda = new Store();
        int expected = 12;

        tienda.agregarProducto("Pan", 1);
        tienda.agregarProducto("Fideos", 5);
        tienda.agregarProducto("Bolsa de leche", 6);

        // Act
        int actual = tienda.calcularCostoTal();


        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void calcularCostoTotalRemoviendoProductoTest() {
        //AAA
        Store tienda = new Store();
        int expected = 11;

        tienda.agregarProducto("Pan", 1);
        tienda.agregarProducto("Fideos", 5);
        tienda.agregarProducto("Bolsa de leche", 6);

        tienda.eliminarProducto("Pan");

        //Act

        int actual = tienda.calcularCostoTal();

        //Act
        Assert.assertEquals(expected, actual);
    }
}
