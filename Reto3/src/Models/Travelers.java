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
    private int documentNumber;
    private String name;
    private String lastname;
    private String gender;
    private int contacto;
    private String correo;

    public Travelers(String documentType, int documentNumber, String name, String lastname, String gender) {
        this.documentType = documentType;
        this.documentNumber = documentNumber;
        this.name = name;
        this.lastname = lastname;
        this.gender = gender;
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

    public String getDocumentType() {
        return documentType;
    }

    public void setDocumentType(String documentType) {
        this.documentType = documentType;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDocumentNumber() {
        return documentNumber;
    }

    public void setDocumentNumber(int documentNumber) {
        this.documentNumber = documentNumber;
    }
    
    
    
}
