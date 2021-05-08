package com.company;

import com.company.utils.StringUtils;

public class Persona {
    private String nombre;
    private String lastName;

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


}
