/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

import aritmetico.FactoryAritmetico;
import convertor.FactoryConvertor;

/**
 *
 * @author Carlos Ruiz
 */
public class FactoryProducerOperacionesCalculadora {
    
    public static AbstracFactoryCalculadora getFactory(String type){
        switch(type){
            case "aritmetico":
                return new FactoryAritmetico();
            case "convertor":
                return new FactoryConvertor();
        }
    return null;
    }
}
