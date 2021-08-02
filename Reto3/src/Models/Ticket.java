/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.Date;

/**
 *
 * @author Unipacifico
 */
public class Ticket {
    private Travelers user;
    private boolean coming;
    private boolean going;
    private String fecha;
    private Double price;
    private String destino;

    public Ticket(Travelers user, boolean coming, boolean going, String fecha, Double price, String destino) {
        this.user = user;
        this.coming = coming;
        this.going = going;
        this.fecha = fecha;
        this.price = price;
        this.destino = destino;
    }

    public Travelers getUser() {
        return user;
    }

    public void setUser(Travelers user) {
        this.user = user;
    }

    public boolean isComing() {
        return coming;
    }

    public void setComing(boolean coming) {
        this.coming = coming;
    }

    public boolean isGoing() {
        return going;
    }

    public void setGoing(boolean going) {
        this.going = going;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    
    
}
