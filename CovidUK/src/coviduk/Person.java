/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coviduk;

/**
 *
 * @author ED_Profesor
 */
public class Person {
    enum genderEnum {
        MALE,
        FEMALE
    }

    private String nombre_pila,	apellido;
    private genderEnum gender;
    private int years;

    public Person(String _first_name, String _last_name, genderEnum _gender, int _years) throws Exception {

        if( (_first_name == null) || (_last_name == null) )
            throw new Exception("El nombre no es válido");
        
        if( (_years > 119) || ( _years < 5) )
            throw new Exception("La edad no es válida");

        this.nombre_pila = _first_name;
        this.apellido = _last_name;
        this.gender = _gender;
        this.years = _years;
    }
    
    public boolean perteneceGrupoI() {
        boolean grupoI = false;
        if(years >= 65) {
            grupoI = true;
        }
        return grupoI;
    }
    
    @Override
    public String toString() {
        return "Person [first_name=" + nombre_pila + ", last_name=" + apellido
                + ", gender=" + gender + ", years=" + years + ", perteneceGrupoI=" + perteneceGrupoI() + "]";
    }

}
