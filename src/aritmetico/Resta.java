/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;

/**
 *
 * @author Carlos Ruiz
 */
public class Resta implements Aritmetico{

    @Override
    public String operacion(String dato1, String dato2) {
        
        if (dato1!=null&&dato2!=null){
            double dato3 = Double.parseDouble(dato1);
            double dato4 = Double.parseDouble(dato2);
        
            double resta = dato3 - dato4;
        
            String cadena = String.valueOf(resta);
     
            return cadena;
        }
        
        return "Error";
    }
    
}
