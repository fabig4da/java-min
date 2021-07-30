/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Unipacifico
 */
public class Store {
    
    public ArrayList<Travelers> travelers;
    public ArrayList<Ticket> tickets;
    public ArrayList<Ticket> tempData;
    
    public Store(){
        travelers = new ArrayList<>();
        tickets = new ArrayList<>();
        tempData = new ArrayList<>();
    }
    
    /**
     * this list stores all the travelers
     * @return list of travelers
     */
    public ArrayList<Travelers> getData(){
        return travelers;
    }
    
    
    /**
     * Add a new user to the travelers list
     * @param user 
     */
    public void saveUser (Travelers user){
        this.travelers.add(user);
    }
    
    
    /**
     * Looks for a traveler by his document number 
     * @param documentNumber
     * @return traveler
     */
    public Travelers findOne(int documentNumber){
        Travelers user = null;
        Iterator<Travelers> userIterator = this.travelers.iterator();
        while(userIterator.hasNext()){
            Travelers ue = userIterator.next();
            if(ue.getDocumentNumber() == documentNumber){
                user = ue;
            }
        }
        return user;
    }
    
    /**
     * Evaluate if an user exist
     * @param documentNumber
     * @return boolean
     */
    public boolean userExist(int documentNumber){
        boolean user = false;
        Iterator<Travelers> userIterator = this.travelers.iterator();
        while(userIterator.hasNext()){
            if(userIterator.next().getDocumentNumber() == documentNumber)
                user = true;
        }
        return user;
    }
    
    /**
     * Return a temporal list of ticket
     * @return ticket
     */
    public ArrayList<Ticket> getTempData(){
        return tempData;
    }
    
    /**
     * Add a ticket to the temporal list of tickets
     */
    public void saveTempTicket (Ticket ticket){
        this.tempData.add(ticket);
    }
    
    /**
     * Remove all of the travelesr from the temporal list
     */
    public void resetTempData (){
        this.tempData.clear();
    }
    
    
}
