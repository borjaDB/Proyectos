/*
Un ejemplo simple del uso de la clase 
 */
package miPaquete;

import javax.ejb.Singleton;

@Singleton
public class AddSession implements AddSessionLocal {
    private int contador;
    
    @Override
    public int addClick(int p1) {
       contador = contador +p1;
        return contador;
    }
}
