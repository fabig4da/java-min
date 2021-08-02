/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Destinos;
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
    
    
    /**
     * Save a ticket and if user is not already registered he will be save
     * @param user
     * @param fecha
     * @param coming
     * @param going
     * @param price
     * @param destino 
     */
    public void buy(Travelers user, String fecha, boolean coming, boolean going, Double price, String destino){
        if(!store.userExist(user.getDocumentNumber())){
            this.store.saveUser(user);
        }
        store.saveTempTicket(new Ticket(user, coming, going, fecha, price, destino)); 
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
    
    public Double getTotal(){
        ArrayList<Ticket> data = this.store.getTempData();
        Double total = 0.00;
        for(Ticket ticket: data){
            total += ticket.getPrice();
        }
        return total;
    }
    /**
     * Return the value of a destination
     * @param destiono
     * @return 
     */
    public Double getDestionoPrice(String destiono){
        Destinos places = new Destinos();
        return places.getDestionoPrice(destiono);
    }
    
    public void entyTempData(){
        this.store.resetTempData();
    }
    
    public void print(){
        ArrayList<Ticket> data = this.store.getTempData();
        Double total = 0.00;
        for(Ticket ticket: data){
            System.out.println("=================================");
            System.out.println("===========  Ticket  ============");
            System.out.println("Nombre: "+ticket.getUser().getName());
            System.out.println("Apellido: "+ticket.getUser().getLastname());
            System.out.println("Destiono: "+ticket.getDestino());
            if(ticket.isComing()){
                System.out.println("Ida y vuelta");
            }
            else{
                System.out.println("Solo ida");
            }
            System.out.println("Valor: "+ticket.getPrice());
            System.out.println("\n \n");
        }
        
        System.out.println("=================================");
        System.out.println("Total: "+this.getTotal());
        System.out.println("=================================");
           
    }
    
    
    
    

}
