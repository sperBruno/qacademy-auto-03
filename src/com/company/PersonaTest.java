package com.company;

import org.junit.*;

public class PersonaTest {

    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void beforeTest() {
        System.out.println("Before test");
    }

    @Test
    public void getNombreTest() {

        //AAA
        //Arrange
        String expected = "bruno";
        String expectedLastName = "barrios";
        Persona persona = new Persona();
        persona.setNombre("bruno");
        persona.setLastName("barrios");

        //Act
        String actual = persona.getNombre();
        String actualLastName = persona.getLastName();
        //Assert

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void getNombreCompletoTest() {
        System.out.println("This is a test second");
        Assert.assertEquals("bruno", "bruno");
    }

    @After
    public void afterTest() {
        System.out.println("After test");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("after class");
    }
}
