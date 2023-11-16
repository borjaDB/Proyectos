package Stateless;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;


@Stateles
@LocalBean
public class BeanLocal {

    public int suma(int numero) {  
        return numero+10; ;   
    }   
    
}
