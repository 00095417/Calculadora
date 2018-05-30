/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertor;

import aritmetico.Aritmetico;
import factory.AbstracFactoryCalculadora;


/**
 *
 * @author Carlos Ruiz
 */
public class FactoryConvertor implements AbstracFactoryCalculadora {
    
    @Override
    public Convertor getConvertor(String type){
        switch (type){
            case "binario":
                return new Binario();
            case "decimal":
                return new Decimal();
        }
        return null;
    }
    
    @Override
    public Aritmetico getAritmetico(String type){
        return null;
    }
    
}
