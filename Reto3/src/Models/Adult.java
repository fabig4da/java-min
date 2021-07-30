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
public class Adult extends Travelers{
    private int contacto;
    private String correo;

    public Adult(String documentType, int documentNumber, String name, String lastname, String gender, int contacto, String correo) {
        super(documentType, documentNumber, name, lastname, gender);
        this.contacto = contacto;
        this.correo = correo;
    }


    

    

    
    
    
    public int getContacto() {
        return contacto;
    }

    public void setContacto(int contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
}
