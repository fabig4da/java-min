/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pratice.models;

/**
 *
 * @author Unipacifico
 */
public class Operations {

    public boolean isPrimo(int number) {
        int cont = 0;
        for (int i = 1; i < number; i++) {
            if ((number % i) == 0) {
                cont++;
            }
        }
        return (cont == 1);
    }

    public boolean isPar(int number) {
        boolean par = false;
        if ((number % 2) == 0) {
            par = true;
        }

        return par;
    }
}
