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
public class Decimal implements Convertor{

    @Override
    public String convertir(String dato) {
        
        int dec = 0;
        
        for (int i = 0;i < dato.length(); i++){
            
            if (!"0".equals(String.valueOf(dato.charAt(i)))&&!"1".equals(String.valueOf(dato.charAt(i)))){            
                return "Error";
            }
        }
        for (int i = dato.length();0<i ; i--){
            
            if ("1".equals(String.valueOf(dato.charAt(i-1)))){
                dec += Math.pow(2, i);
            }
        }
        
        return String.valueOf(dec);
    }
    
}
