/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

/**
 *
 * @author Unipacifico
 */
public class Kids extends Travelers{
    private int edad;

    public Kids( String documentType, int documentNumber, String name, String lastname, String gender, int edad) {
        super(documentType, documentNumber, name, lastname, gender);
        this.edad = edad;
    }

    
    
  

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
}
