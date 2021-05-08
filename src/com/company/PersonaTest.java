package com.company;

import org.junit.*;

public class PersonaTest {
    private Persona persona;
    @BeforeClass
    public static void beforeClass() {
        System.out.println("Before Class");
    }

    @Before
    public void beforeTest() {
        persona = new Persona();
        persona.setNombre("bruno");
        persona.setLastName("barrios");
    }

    @Test
    public void getNombreTest() {

        //AAA
        //Arrange
        String expected = "bruno";
        String expectedLastName = "barrios";

        //Act
        String actual = persona.getNombre();
        String actualLastName = persona.getLastName();
        //Assert

        Assert.assertEquals(expected, actual);
        Assert.assertEquals(expectedLastName, actualLastName);
    }

    @Test
    public void getNombreCompletoTest() {
        //AAA
        String expected = "Bruno Barrios";

        String actual = persona.getFullName();

        Assert.assertEquals(expected, actual);
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
