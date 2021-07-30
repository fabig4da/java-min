/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app;

import Controllers.TicketController;
import Views.View;

/**
 *
 * @author Unipacifico
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        View view = new View();
        view.start();
        TicketController ticket = new TicketController();
    }
    
}
