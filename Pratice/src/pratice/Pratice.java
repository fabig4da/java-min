/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice;

import static java.lang.System.out;
import javax.swing.JOptionPane;
import pratice.models.Operations;

/**
 *
 * @author Unipacifico
 */
public class Pratice {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int num =0;
        for(int x=10; x<=50; x++){
            num+=x;
            System.out.println(x+": "+num);
        }
    }
    
}
