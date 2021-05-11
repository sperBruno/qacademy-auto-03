package com.company.store;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StoreTest {
    private Store tienda;

    @Before
    public void beforeTests() {
        tienda = new Store();
    }

    @Test
    public void calcularCostoSinProductosTest() {
        //AAA
        int expected = 0;

        //Act
        int actual = tienda.calcularCostoTal();

        //Assert
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void calcularCostoTotalTest() {
        //AAA
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

    @Test
    public void validarDetalleCompraTest() {
        //AAA
        String expected = "Pan - Bs. 1\nFideos - Bs. 5\nBolsa de leche - Bs. 6\nTotal - Bs. 12";
        tienda.agregarProducto("Pan", 1);
        tienda.agregarProducto("Fideos", 5);
        tienda.agregarProducto("Bolsa de leche", 6);

        //Act
        String actual = tienda.obtenerDetalleCompra();

        //Assert
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void validarDetalleSinProductos() {
        //AAA
        String expected = "Total - Bs. 0";

        //Act
        String actual = tienda.obtenerDetalleCompra();

        //Assert
        Assert.assertEquals(expected, actual);
    }
}