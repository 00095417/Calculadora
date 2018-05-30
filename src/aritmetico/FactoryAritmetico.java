/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aritmetico;

import convertor.Convertor;
import factory.AbstracFactoryCalculadora;

/**
 *
 * @author Carlos Ruiz
 */
public class FactoryAritmetico implements AbstracFactoryCalculadora{
    
    @Override
    public Aritmetico getAritmetico(String type){
        switch (type){
            case "suma":
                return new Suma();
            case "resta":
                return new Resta();
            case "multiplicacion":
                return new Multiplicacion();
            case "division":
                return new Division();
        }
        return null;
    }
    
    @Override
    public Convertor getConvertor(String type){
        return null;
    }
    
}
