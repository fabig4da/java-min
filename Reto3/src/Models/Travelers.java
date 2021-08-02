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
public class Travelers {
    private String documentType;
    private Integer documentNumber;
    private String name;
    private String lastname;
    private String gender;
    private Integer contacto;
    private String correo;
    private Integer edad;

    public Travelers(String documentType, Integer documentNumber, String name, String lastname,  Integer contacto, String correo, String gender, Integer edad) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
        this.contacto = contacto;
        this.correo = correo;
        this.edad = edad;
    }

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public Integer getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(Integer documentNumber) {
        this.documentNumber = documentNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public Integer getContacto() {
        return contacto;
    }

    public void setContacto(Integer contacto) {
        this.contacto = contacto;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    
    
    
}
