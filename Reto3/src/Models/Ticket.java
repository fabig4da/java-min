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

    public Ticket(Travelers user, boolean coming, boolean going, String fecha) {
        this.user = user;
        this.coming = coming;
        this.going = going;
        this.fecha = fecha;
    }

    
    
}
