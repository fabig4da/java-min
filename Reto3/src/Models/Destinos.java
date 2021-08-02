/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Models;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Unipacifico
 */
public class Destinos {
    
    /**
     *
     */
    public HashMap<String, Double> places;
    public Destinos(){
        places = new HashMap<>();
        places.put("Destino 1", 50000.00);
        places.put("Destino 2", 40000.00);
        places.put("Destino 3", 30000.00);
        places.put("Destino 4", 60000.00);
    }
    
    public Double getDestionoPrice(String destino){
        return this.places.get(destino);
    }
}
