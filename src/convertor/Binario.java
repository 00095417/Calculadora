/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor;

/**
 *
 * @author Carlos Ruiz
 */
public class Binario implements Convertor {

    @Override
    public String convertir(String dato) {
        
        String cadena_bin="";
        Integer entero = Integer.valueOf(dato);
        
        if (entero == 0){
            return "0";
        }
        
        while (entero>0){
            int reciduo = entero%2;
            String cadena = Integer.toString(reciduo);
            cadena_bin =  cadena + cadena_bin;
            entero /=2;

        }
        return cadena_bin;
    }
    
    
}
