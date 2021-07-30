/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minticclase01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Unipacifico
 */
public class MinticClase01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hello word!!!");
        
        
        // Entradas input
        //Scanner in = new Scanner(System.in);
        //System.out.print("Ingrese su nombre: ");
        //String nombre = in.nextLine();
        //System.out.println("Hola " + nombre);
        
        //System.out.print("Ingrese su nombre: ");
        //int edad = in.nextInt();
        //System.out.println("Edad es: " + edad);
        
        
       //Array  
       String array[] = {"Fabian", "Garces", "Gar"};
        
       String[][] letras = {
           {"a", "b", "d"},
           {"f", "e", "e"},
           {"v", "n", "o"}
       };
       //Array list
       ArrayList<Integer> miLista = new ArrayList<Integer>();
       
       for(int x = 0; x< 100; x++){
           miLista.add(x);
       }
       
       for(int item : miLista){
           System.out.println(item);
       }
       
       //Maps
       Map<String, Object> persona = new HashMap();
       persona.put("nombre", "Fabian");
       persona.put("edad", 24);
       
       int edad = (int) persona.get("edad");
    
        try{
            // logic here
        }catch(Exception err){
                System.out.println(err);
        }

        }
    
}
