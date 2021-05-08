package com.company;

import com.company.utils.StringUtils;

public class Persona {
    private String nombre;
    private String lastName;
    private int telf;

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public int getTelf() {
        return this.telf;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getFullName() {
        return StringUtils.capitalizeWord(this.nombre).concat(" ")
                .concat(StringUtils.capitalizeWord(this.lastName));
    }


    public String toJson() {
        String person = String.format("{\"Nombre\": \"%s\"," +
                "\"Apellido\": \"%s\"," +
                "\"Cel\": %s," +
                "\"Nombre Completo\": \"%s\"}", this.nombre,
                this.lastName,
                this.telf,
                this.getFullName());
        return person;
    }
}
