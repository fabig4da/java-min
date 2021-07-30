/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Adult;
import Models.Store;
import Models.Ticket;
import Models.Travelers;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Unipacifico
 */
public class TicketController {
    //private Date fecha;
    private Store store;
    
    public TicketController() {
        this.store = new Store();
    }
    
    
    
    public void buy(Travelers user, String fecha, boolean coming, boolean going){
        if(!store.userExist(user.getDocumentNumber())){
            this.store.saveUser(user);
        }
        store.saveTempTicket(new Ticket(user, coming, going, fecha)); 
    }
    
    public ArrayList<Ticket> findTickets(){
        return this.store.getTempData();
    }
    
    public ArrayList<Travelers> findTravelers(){
        return this.store.getData();
    }
    
    public Travelers findTraveler(int documentNumber){
        return this.store.findOne(documentNumber);
    }
    
    
    
    

}
