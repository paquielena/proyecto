/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.actividadjunitmaven;

/**
 *
 * @author Paqui Elena
 */
public class Persona {
    private int edad;

    public Persona(int edad) {
        this.edad = edad;
    }

    public boolean isMayorDeEdad() {

        if (edad >= 18 && edad <= 120)  {
            return true;
        } else {
            return false;
        }
    }
}
